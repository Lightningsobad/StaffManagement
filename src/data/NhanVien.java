package data;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author quang
 */
public abstract class NhanVien {

    protected String hoTen;
    protected int namVaoLam;
    protected final double PHU_CAP = 100000;

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    public NhanVien() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập năm vào làm: ");
        namVaoLam = Integer.parseInt(sc.nextLine());
    }

    public double tinhPhuCap() {
        Date now = new Date();
        int d = LocalDate.now().getYear();
        return PHU_CAP + (d - namVaoLam) * 20000;
    }

    public abstract double tinhLuong();

    public static void inTieuDe() {
        System.out.printf("|%-10s|%-20s|%-10s|%-10s|%-15s|\n", "HỌ TÊN",
                 "NĂM VÀO LÀM", "PHỤ CẤP", "LƯƠNG", "TỔNG THU NHẬP");
    }

    public void inThongTin() {
        System.out.printf("|%-10s|%-20d|%-10.1f|%-10.1f|%-20.1f|\n", hoTen, namVaoLam,
                 tinhPhuCap(), tinhLuong(), (tinhLuong() + tinhPhuCap()));

    }

}
