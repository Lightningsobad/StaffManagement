package data;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Cabinet {

    public Scanner sc = new Scanner(System.in);
    public NhanVien list[];
    public int soNhanVien;

    public Cabinet() {
    }

    public void nhapXuatThongTin() {
        int n;
        System.out.print("Nhập số nhân viên muốn thêm: ");
        soNhanVien = sc.nextInt();
        NhanVien list[] = new NhanVien[soNhanVien];
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập nhân viên thứ " + (i + 1));
            do {
                System.out.print("Nhập loại nhân viên(1. Nhân viên sản xuất, 2. Nhân viên văn phòng): ");
                n = sc.nextInt();
            } while (n != 1 && n != 2);

            if (n == 1) {
                list[i] = new NhanVienSX();
            } else {
                list[i] = new NhanVienVP();
            }

            list[i].nhap();

        }
        NhanVien.inTieuDe();
        for (int i = 0; i < soNhanVien; i++) {
            list[i].inThongTin();
        }
        System.out.println("---------------------------------------------------");
        int sum = 0;
        for (int i = 0; i < soNhanVien; i++) {
            sum += list[i].tinhLuong() + list[i].tinhPhuCap();
        }
        System.out.println("Tổng tiền công ty phải trả cho nhân viên: " + sum);

    }

}
