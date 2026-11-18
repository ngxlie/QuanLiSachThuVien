package BTTuan9;

public class sachGiaoKhoa extends Sach{
    private String tinhTrang;

    public sachGiaoKhoa(String maSach, String ngayNhap, int soLuong, double donGia, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, soLuong, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }
    //phuong thuc tinh thanh tien
    public double thanhTien(){
        if (tinhTrang.equalsIgnoreCase("Moi"))//so sanh chuoi khong phan biet chu hoa thuong
            return soLuong * donGia;
        else
            return soLuong * donGia * 0.5;
    }

    @Override
    public void inThongTin() {
        System.out.println("--Sách Giáo Khoa--");
        super.inThongTin();
        System.out.println("tinh trang: "+tinhTrang);
        System.out.println("Thanh tien: "+thanhTien());
        System.out.println("----------------------------");
    }

}
