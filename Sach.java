import java.time.Year;

public class Sach{
   private String maSach ;
    private String tieuDe ;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    // Getter
    public String getMaSach() {
        return maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Setter
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNamXuatBan(int namXuatBan) {
        int namHienTai = java.time.Year.now().getValue();
        if (namXuatBan>0 && namXuatBan <= namHienTai)
            this.namXuatBan=namXuatBan;
        else
            System.out.println("Năm XB không hợp lệ!");

    }

    public void setSoLuong(int soLuong) {
        if(soLuong>=0)
         this.soLuong = soLuong;
        else
            System.out.println("Số lượng không hợp lệ!");
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


