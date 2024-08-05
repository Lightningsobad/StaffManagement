
package data;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public abstract class NhanVien {
    protected String hoTen;
    protected int namVaoLam;
    protected final double PHU_CAP_BAN_DAU = 100000;
    public abstract double tinhLuong();

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    @Override
    public String toString() {
        return "NhanVien:" + "HỌ TÊN: " + hoTen + ", NĂM VÀO LÀM: " + namVaoLam + ", PHỤ CẤP BAN ĐẦU: " + PHU_CAP_BAN_DAU;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    
    
    public double tinhPhuCap() {
        int d = LocalDate.now().getYear();
        return PHU_CAP_BAN_DAU + (d - namVaoLam) * 20000;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập năm vào làm: ");
        namVaoLam = sc.nextInt();   
    }
    
    public static void inTieuDe() {
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|\n", "HỌ TÊN"
                , "NĂM VÀO LÀM", "PHỤ CẤP", "LƯƠNG", "TỔNG THU NHẬP");
    }
    
    public void inThongTin() {
        System.out.printf("|%-15s|%-15d|%-15.1f|%-15.1f|%-15.1f|\n", hoTen, namVaoLam, tinhPhuCap(), tinhLuong(), 
                tinhLuong() + tinhPhuCap());
    }
}
