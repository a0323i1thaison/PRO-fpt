/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demohashmap;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author thais
 */
public class Demohashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 5);
        
        // hiển thị các dòng mã băm mà HashMap lưu trữ 
         System.out.println("Ma bam cua cac khoa trong HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println("Khoa: " + key + ", Ma bam: " + key.hashCode());
    }
        // hiển thị không theo thứ tự 
         System.out.println("HashMap (khong theo thu tu):");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

      // Thêm một khóa đã tồn tại
        hashMap.put("Apple", 10); // Cập nhật giá trị cho khóa "Apple"
        
        // In ra HashMap sau khi cập nhật
        System.out.println("HashMap sau khi cập nhật giá trị cho khóa 'Apple': " + hashMap);
        }
    }
    
}
