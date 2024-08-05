package data;

import java.util.Comparator;

/**
 *
 * @author quang
 */
public class SoSanhPhuCap implements Comparator<NhanVien> {

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.tinhPhuCap() > o2.tinhPhuCap()) {
            return 1;
        } else if (o1.tinhPhuCap()< o2.tinhPhuCap()) {
            return -1;
        } else {
            return 0;
        }
    }

}
