public class Sach{
    String maSach ;
    String tieuDe ;
    String tacGia;
    int namXuatBan;
    int soLuong;
    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public void hienThiThongTin() {
        System.out.println("===THÔNG TIN SÁCH===");
        System.out.println("Mã sách: " + this.maSach);
        System.out.println("Tiêu đề: " + this.tieuDe);
        System.out.println("Tác giả: " + this.tacGia);
        System.out.println("Năm Xuất Bản: " + this.namXuatBan);
        System.out.println("Số lượng: " + this.soLuong);
    }

}


