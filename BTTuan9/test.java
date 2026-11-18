package BTTuan9;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Sach> dsSach = new ArrayList<>();
        sachGiaoKhoa sgk = new sachGiaoKhoa(
                "SGK01",
                "18/11/2026",
                10,
                20000,
                "NXB Giáo Dục",
                "moi"
        );
        dsSach.add(sgk);
        //sachthamkhao
        sachThamKhao stk=new sachThamKhao(
                "STK001",
                "20/12/2023",
                12,
                210000,
                "NXB kim dong",
                2001
        );
        dsSach.add(stk);
        for (Sach s : dsSach) {
            s.inThongTin();}
    }


}
