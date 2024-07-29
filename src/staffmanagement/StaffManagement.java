package staffmanagement;

import data.Cabinet;
import data.NhanVien;
import data.NhanVienSX;
import data.NhanVienVP;
import java.util.*;

/**
 *
 * @author quang
 */
public class StaffManagement {

    public static void main(String[] args) {
//       nhapThongTin();
//       inThongTin();
        Cabinet cb1 = new Cabinet();
        cb1.nhapXuatThongTin();
//        cb1.inThongTin();
    }

//    public static void nhapThongTin() {
//        int n;
//        System.out.println("Nhập số nhân viên muốn thêm: ");
//        soNhanVien = sc.nextInt();
//        for (int i = 0; i < soNhanVien; i++) {
//            System.out.println("Nhập nhân viên thứ " + (arr.size() + 1));
//            System.out.print("Nhập loại nhân viên(1. Nhân viên sản xuất, 2. Nhân viên văn phòng): ");
//            n = sc.nextInt();
//            if (n == 1) {
//                list1[i] = new NhanVienSX();
//                arr.add(list1[i]);
//                arr.get(i).nhapThongTin();
//            }
//            else {
//                list2[i] = new NhanVienVP();
//                arr.add(list2[i]);
//                list2[i].nhapThongTin();
//                list2[i].nhapThongTinVP();
//            }
//                
//        }
//    }
//    
//    public static void inThongTin() {
//        NhanVien.inTieuDe();
//        for (NhanVien x : arr) {
//            x.inThongTin();
//        }
//    }
}
