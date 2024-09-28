/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CongTy;
import Model.NhanVienChinhThuc;
import Model.NhanVienThoiVu;
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

    public ControllerNhanVien(CongTy congTy, View.ViewNhanVien view) {
        throw new UnsupportedOperationException("Not supported yet.");
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
                    view.hienThiThongDiep("Danh sách đã được sắp xếp theo lương.");
                    break;
                case 4:
                    String tenDeXoa = view.layTenNhanVien();
                    congTy.timVaXoaNhanVienTheoTen(tenDeXoa);
                    view.hienThiThongDiep("Nhân viên đã được xóa (nếu có).");
                    break;
                case 5:
                    double luongTrungBinhThoiVu = congTy.luongTrungBinhTheoLoai(NhanVienThoiVu.class);
                    double luongTrungBinhChinhThuc = congTy.luongTrungBinhTheoLoai(NhanVienChinhThuc.class);
                    view.hienThiLuongTrungBinh(luongTrungBinhThoiVu, luongTrungBinhChinhThuc);
                    break;
                case 6:
                    view.hienThiThongDiep("Thoát khỏi chương trình.");
                    return;
                default:
                    view.hienThiThongDiep("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private void themNhanVien() {
        int loai = view.layLoaiNhanVien();
        String id = view.layDuLieu("ID: ");
        String ho = view.layDuLieu("Họ: ");
        String ten = view.layDuLieu("Tên: ");
        int tuoi = view.layDuLieuInteger("Tuổi: ");
        String ngaySinhStr = view.layDuLieu("Ngày sinh (yyyy-MM-dd): ");
        Date ngaySinh = null;
        try {
            ngaySinh = formatter.parse(ngaySinhStr);
        } catch (ParseException e) {
            view.hienThiThongDiep("Ngày sinh không hợp lệ.");
            return; // quay lại menu
        }

        if (loai == 1) {
            int soNgayLamViec = view.layDuLieuInteger("Số ngày làm việc: ");
            double chietKhau = view.layDuLieuDouble("Mức chiết khấu: ");
            congTy.themNhanVien(new NhanVienThoiVu(id, ho, ten, tuoi, ngaySinh, soNgayLamViec, chietKhau));
        } else if (loai == 2) {
            int soNgayLamViec = view.layDuLieuInteger("Số ngày làm việc: ");
            int soGioOT = view.layDuLieuInteger("Số giờ OT: ");
            congTy.themNhanVien(new NhanVienChinhThuc(id, ho, ten, tuoi, ngaySinh, soNgayLamViec, soGioOT));
        }
    }
}
