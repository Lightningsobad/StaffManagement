package stage;

import data.*;
import java.util.*;

/**
 *
 * @author quang
 */
public class StaffManagement {

    public static List<NhanVien> arr = new ArrayList();
    public static List<NhanVienSX> arr1 = new ArrayList();
    public static List<NhanVienVP> arr2 = new ArrayList();
    public static int loaiNhanVien;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        fakeData();
        nhapXuatThongTin();
        sapXepNhanVien();
        timkiemNhanVien();
        phanLoaiNhanVien();
    }

    public static void fakeData() {
        NhanVien nv1 = new NhanVienSX("NGUYEN A", 2023, 100);
        NhanVien nv2 = new NhanVienSX("NGUYEN B", 2022, 150);
        NhanVien nv3 = new NhanVienVP("NGUYEN C", 2021, 50000, 3);
        NhanVien nv4 = new NhanVienVP("NGUYEN D", 2020, 70000, 5);
        arr.add(nv1);
        arr.add(nv2);
        arr.add(nv3);
        arr.add(nv4);
        NhanVien.inTieuDe();
        for (NhanVien x : arr) {
            x.inThongTin();
        }
    }

    public static void nhapXuatThongTin() {
        NhanVien list[] = new NhanVien[100];
        
        for (int i = 4; i < 100; i++) {
            System.out.println("Nhập thông tin nhân viên thứ #" + (i + 1));
            do {
                System.out.print("Nhập loại nhân viên (1. Nhân viên sản xuất, 2. Nhân viên văn phòng): ");
                loaiNhanVien = sc.nextInt();
            } while (loaiNhanVien != 1 && loaiNhanVien != 2);
            if (loaiNhanVien == 1) {               
                list[i] = new NhanVienSX();               
            } else {               
                list[i] = new NhanVienVP();
            }
            list[i].nhap();
            arr.add(list[i]);
            if (list[i].getHoTen().isEmpty()) {
                arr.remove(list[i]);
                break;
            }

        }
        System.out.println("Thông tin của các nhân viên: ");
        NhanVien.inTieuDe();
        for (NhanVien x : arr) {
            x.inThongTin();
        }
        System.out.println("----------------------------------------------------------");
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).tinhLuong() + arr.get(i).tinhPhuCap();
        }
        System.out.println("Tổng tiền công ty phải trả cho nhân viên: " + sum);

    }
    
    public static void phanLoaiNhanVien() {
        System.out.println("Phân loại nhân viên:");
        System.out.println("Nhân viên sản xuất: ");
        NhanVien.inTieuDe();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) instanceof NhanVienSX)
                arr.get(i).inThongTin();           
        }
        NhanVien.inTieuDe();
        System.out.println("Nhân viên văn phòng: ");
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) instanceof NhanVienVP)
                arr.get(i).inThongTin();    
        }
    }

    public static void sapXepNhanVien() {
        System.out.println("Sắp xếp nhân viên tăng dần theo lương: ");
        SapXepTheoLuong sl = new SapXepTheoLuong();
        Collections.sort(arr, sl);
        NhanVien.inTieuDe();
        for (NhanVien x : arr) {
            x.inThongTin();
        }
    }
    
    public static void timkiemNhanVien() {
        SoSanhPhuCap spc = new SoSanhPhuCap();
        System.out.println("Nhân viên có phụ cấp cao nhất: ");
        System.out.println(Collections.max(arr, spc).toString());   
        System.out.println("Nhân viên có phụ cấp ít nhất: ");
        System.out.println(Collections.min(arr, spc).toString());        
    }

}
