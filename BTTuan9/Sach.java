package BTTuan9;

public class Sach {
protected String maSach ;
protected String  ngayNhap;
protected   int soLuong;
protected double donGia;
protected String nhaXuatBan;
//tao constructor
public Sach(String maSach, String ngayNhap, int soLuong, double donGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
        }

public void inThongTin() {
        System.out.println("Ma Sach: " + maSach);
        System.out.println("Ngay Nhap: "+ngayNhap);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don Gia: " + donGia);
        System.out.println("Nha Xuat Ban: "+nhaXuatBan);
        }

        }

