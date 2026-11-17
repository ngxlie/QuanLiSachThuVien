import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        // khoi tao danh sach sach
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        //tao doi tuong cho sach
        Sach s1 = new Sach("MS001", "Trinh Tham","Luong Quang Dung",2000,32);
        Sach s2 = new Sach("MS002","Cuoc doi cua toi","Nguyen Van A", 2023,42);
        Sach s3= new Sach("MS003","Chuyen di Hue","Tran Thi B",2026,12);
        //Them vao danh sach
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);
        //hien thi dnah sach
        System.out.println("Danh sach sach: ");
        for(int i= 0; i <danhSachSach.size(); i ++){
            danhSachSach.get(i).hienThiThongTin();

        }

    }
}
