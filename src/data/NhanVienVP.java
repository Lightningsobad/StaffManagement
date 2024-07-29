
package data;
import java.util.*;
/**
 *
 * @author quang
 */

public class NhanVienVP extends NhanVien {
    private double mucLuong;
    private int soNgayNghi;

    public NhanVienVP(String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
    }

    public NhanVienVP() {
        super();
    }
    
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mức lương: ");
        mucLuong = sc.nextDouble();
        System.out.print("Nhập số ngày nghỉ: ");
        soNgayNghi = sc.nextInt();
    }
            
    
    
    
    
    @Override
    public double tinhLuong() {
        return mucLuong - soNgayNghi * 10000;
    }
    
}
