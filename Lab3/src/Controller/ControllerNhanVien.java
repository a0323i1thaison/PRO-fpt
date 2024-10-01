/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CongTy;
import Model.NhanVienChinhThuc;
import Model.NhanVienThoiVu;
import View.ViewNhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thais
 */
public class ControllerNhanVien {
    private CongTy congTy;
    private ViewNhanVien view;
    private SimpleDateFormat formatter;


    public ControllerNhanVien(CongTy congTy, ViewNhanVien view) {
        this.congTy = congTy;
        this.view = view;
        this.formatter = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void chay() {
        while (true) {
            int luaChon = view.hienThiMenu();
            switch (luaChon) {
                case 1:
                    themNhanVien();
                    break;
                case 2:
                    view.hienThiNhanViens(congTy.getNhanViens());
                    break;
                case 3:
                    congTy.sapXepNhanVienTheoLuong();
                    view.hienThiThongDiep("Danh sach da duoc sap xep theo luong.");
                    break;
                case 4:
                    String tenDeXoa = view.layTenNhanVien();
                    congTy.timVaXoaNhanVienTheoTen(tenDeXoa);
                    view.hienThiThongDiep("Nhan vien da duoc xoa (neu co ).");
                    break;
                case 5:
                    double luongTrungBinhThoiVu = congTy.luongTrungBinhTheoLoai(NhanVienThoiVu.class);
                    double luongTrungBinhChinhThuc = congTy.luongTrungBinhTheoLoai(NhanVienChinhThuc.class);
                    view.hienThiLuongTrungBinh(luongTrungBinhThoiVu, luongTrungBinhChinhThuc);
                    break;
                case 6:
                    view.hienThiThongDiep("Thoat khoi chuong trinh.");
                    return;
                default:
                    view.hienThiThongDiep("Lua chon khong hop le . Vui long thu lai.");
            }
        }
    }

    private void themNhanVien() {
        int loai = view.layLoaiNhanVien();
        String id = view.layDuLieu("ID: ");
        String ho = view.layDuLieu("Ho: ");
        String ten = view.layDuLieu("Ten: ");
        int tuoi = view.layDuLieuInteger("Tuoi: ");
        String ngaySinhStr = view.layDuLieu("Ngay sinh (yyyy-MM-dd): ");
        Date ngaySinh = null;
        try {
            ngaySinh = formatter.parse(ngaySinhStr);
        } catch (ParseException e) {
            view.hienThiThongDiep("Ngay sinh khong hop le.");
            return; // quay lại menu
        }

        if (loai == 1) {
            int soNgayLamViec = view.layDuLieuInteger("So ngay lam viec: ");
            double chietKhau = view.layDuLieuDouble("Muc chiet khau: ");
            congTy.themNhanVien(new NhanVienThoiVu(id, ho, ten, tuoi, ngaySinh, soNgayLamViec, chietKhau));
        } else if (loai == 2) {
            int soNgayLamViec = view.layDuLieuInteger("So ngay lam viec: ");
            int soGioOT = view.layDuLieuInteger("So gio OT: ");
            congTy.themNhanVien(new NhanVienChinhThuc(id, ho, ten, tuoi, ngaySinh, soNgayLamViec, soGioOT));
        }
    }
}
