
package data;

import java.util.*;
/**
 *
 * @author quang
 */
public class NhanVienSX extends NhanVien{
    private int soSanPham;

    public NhanVienSX(int soSanPham, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.soSanPham = soSanPham;
    }

    public NhanVienSX() {
        super();
    }
      
    
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sản phẩm: ");
        soSanPham = sc.nextInt();
    }
    
    
    
    @Override
    public double tinhLuong() {
        return soSanPham * 10000;
    }
    
}
