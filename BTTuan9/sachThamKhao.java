package BTTuan9;

public class sachThamKhao extends Sach {
    private double thue;

    public sachThamKhao(String maSach, String ngayNhap, int soLuong, double donGia, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, soLuong, donGia, nhaXuatBan);
        this.thue = thue;
    }
    public double thanhTien(){
        return soLuong*donGia + thue;
    }

    @Override
    public void inThongTin() {
        System.out.println("--Sách Tham Khảo--");
        super.inThongTin();
        System.out.println("Thue: "+thue);
        System.out.println("Thanh Tien: "+thanhTien());
        System.out.println("----------------------------");
    }
}
