import java.util.Scanner;

public class BTTuan3 {

    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;
    private int loaiSach;

    // Constructor
    public BTTuan3() {
    }

    public void setMaSach(String ms) {
        maSach = ms;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setTenSach(String ts) {
        tenSach = ts;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTacGia(String tg) {
        tacGia = tg;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setNamXuatBan(int nam) {
        namXuatBan = nam;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setDonGia(double gia) {
        donGia = gia;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setSoLuong(int sl) {
        soLuong = sl;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setLoaiSach(int ls) {
        loaiSach = ls;
    }

    public int getLoaiSach() {
        return loaiSach;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        setMaSach(scanner.nextLine());

        System.out.print("Nhap ten sach: ");
        setTenSach(scanner.nextLine());

        System.out.print("Nhap tac gia: ");
        setTacGia(scanner.nextLine());

        // Kiem tra nam xuat ban
        do {
            System.out.print("Nhap nam xuat ban (1-2026): ");
            setNamXuatBan(scanner.nextInt());

            if (getNamXuatBan() <= 0
                    || getNamXuatBan() > 2026) {
                System.out.println(
                    "Nam xuat ban khong hop le! Nhap lai."
                );
            }
        } while (getNamXuatBan() <= 0
                || getNamXuatBan() > 2026);

        // Kiem tra don gia
        do {
            System.out.print("Nhap don gia: ");
            setDonGia(scanner.nextDouble());

            if (getDonGia() <= 0) {
                System.out.println(
                    "Don gia phai lon hon 0! Nhap lai."
                );
            }
        } while (getDonGia() <= 0);

        // Kiem tra so luong
        do {
            System.out.print("Nhap so luong: ");
            setSoLuong(scanner.nextInt());

            if (getSoLuong() < 0) {
                System.out.println(
                    "So luong phai >= 0! Nhap lai."
                );
            }
        } while (getSoLuong() < 0);

        // Chon loai sach
        do {
            System.out.println("1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.println("3. Sach chuyen nganh");
            System.out.println("4. Sach khac");

            System.out.print("Nhap loai sach: ");
            setLoaiSach(scanner.nextInt());

            if (getLoaiSach() < 1
                    || getLoaiSach() > 4) {
                System.out.println(
                    "Loai sach khong hop le! Nhap lai."
                );
            }
        } while (getLoaiSach() < 1
                || getLoaiSach() > 4);

        scanner.close();
    }

    // Kiem tra sach 
    public boolean kiemTraHopLe() {
        return getDonGia() > 0
                && getSoLuong() >= 0
                && getNamXuatBan() > 0
                && getNamXuatBan() <= 2026;
    }

    // Bai 2: Phan loai gia sach
    public String phanLoaiGia() {
        if (getDonGia() <= 0) {
            return "Gia sach khong hop le";
        } else if (getDonGia() < 50000) {
            return "Sach gia thap";
        } else if (getDonGia() <= 100000) {
            return "Sach gia trung binh";
        } else if (getDonGia() <= 200000) {
            return "Sach gia cao";
        } else {
            return "Sach gia dac biet";
        }
    }

    // Bai 3: Phan loai ton kho
    public String phanLoaiTonKho() 
    {
        if (getSoLuong() < 0) {
            return "So luong khong hop le";
        } else if (getSoLuong() == 0) {
            return "Het sach";
        } else if (getSoLuong() <= 5) {
            return "Sap het";
        } else if (getSoLuong() <= 20) {
            return "Con it";
        } else {
            return "Con nhieu";
        }
    }

    // Bai 4: Chon loai sach 
    public String layLoaiSach() 
    {
        switch (getLoaiSach()) 
        {
            case 1:
                return "Sach giao khoa";

            case 2:
                return "Sach tham khao";

            case 3:
                return "Sach chuyen nganh";

            case 4:
                return "Sach khac";

            default:
                return "Loai sach khong hop le";
        }
    }

    // Tinh thanh tien
    public double tinhThanhTien() 
    {
        return getDonGia() * getSoLuong();
    }

    // Tinh phi van chuyen 
    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 5 / 100;
    }

    // Tinh tong tien nhap kho
    public double tinhTongTienNhap() 
    {
        return tinhThanhTien()
                + tinhPhiVanChuyen();
    }

    // Xuat thong tin sach
    public void xuat() {

        System.out.println("Ma sach: " + getMaSach());
        System.out.println("Ten sach: " + getTenSach());
        System.out.println("Tac gia: " + getTacGia());
        System.out.println("Nam xuat ban: " + getNamXuatBan());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("Loai sach: " + layLoaiSach());


        if (kiemTraHopLe()) {
            System.out.println("Sach hop le");
        } else {
            System.out.println("Sach khong hop le");
        }

        System.out.println("Phan loai gia: " + phanLoaiGia());
        System.out.println("Phan loai ton kho: " + phanLoaiTonKho());

        System.out.println("\nTinh tien");
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("Phi van chuyen: " + tinhPhiVanChuyen());
        System.out.println("Tong tien nhap: " + tinhTongTienNhap());
    }

    // Ham main
    public static void main(String[] args) {
        BTTuan3 sach = new BTTuan3();

        System.out.println("Nhap thong tin quan li sach:");

        sach.nhap();
        sach.xuat();
    }
}