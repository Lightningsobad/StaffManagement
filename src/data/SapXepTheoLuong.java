
package data;

import java.util.Comparator;

/**
 *
 * @author quang
 */
public class SapXepTheoLuong implements Comparator<NhanVien>{

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if(o1.tinhLuong() > o2.tinhLuong())
            return 1;
        else if(o1.tinhLuong() < o2.tinhLuong())
            return -1;
        else
            return 0;
    }
    
    
}
