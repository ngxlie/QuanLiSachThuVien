
import java.util.Scanner;
import java.util.ArrayList;

public class BTTuan5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // BAI 1: MANG
        int[] soLuong = new int[5];
        int tong = 0;
        int max;

        // Nhap so luong 5 cuon sach
        for (int i = 0; i < 5; i++) {

            do {
                System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
                soLuong[i] = scanner.nextInt();

                if (soLuong[i] < 0) {
                    System.out.println("So luong phai >= 0!");
                }

            } while (soLuong[i] < 0);
        }
        max = soLuong[0];
        // Tinh tong va tim so lon nhat
        for (int i = 0; i < 5; i++) {

            tong += soLuong[i];

            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);

        scanner.nextLine();

        // BAI 2:
        ArrayList<String> danhSachMaSach =
                new ArrayList<String>();

        // BAI 3: THONG TIN SACH
        ArrayList<String> danhSachSach =
                new ArrayList<String>();

        int chon;

        // BAI 4: MENU
        do {

            System.out.println("\n---------- QUAN LY THU VIEN ---------");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("-----------------------------------");

            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {

                // 1. THEM SACH
                case 1: {

                    BTTuan3 sach = new BTTuan3();

                    System.out.println("\n===== NHAP THONG TIN SACH =====");

                    sach.nhap(scanner);

                    if (danhSachMaSach.contains(sach.getMaSach())) {

                        System.out.println("Ma sach da ton tai!");

                    } else {

                        danhSachMaSach.add(sach.getMaSach());

                        danhSachSach.add(taoThongTinSach(sach));

                        System.out.println("Them sach thanh cong!");
                    }

                    break;
                }

                // 2. HIEN THI SACH
                case 2: {

                    if (danhSachSach.size() == 0) {

                        System.out.println("Danh sach sach rong!");

                    } else {

                        for (int i = 0; i < danhSachSach.size(); i++) {

                            System.out.println("\n===== SACH THU " + (i + 1) + " =====");

                            hienThiSach(danhSachSach.get(i));
                        }
                    }

                    break;
                }

                // 3. TIM SACH
                case 3: {

                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = scanner.nextLine();

                    if (danhSachMaSach.contains(maTim)) {

                        int viTri = danhSachMaSach.indexOf(maTim);

                        System.out.println("Da tim thay sach!");

                        hienThiSach(danhSachSach.get(viTri));

                    } else {

                        System.out.println("Khong tim thay sach!");
                    }

                    break;
                }

                // 4. XOA SACH
                case 4: {

                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = scanner.nextLine();

                    if (danhSachMaSach.contains(maXoa)) {

                        int viTri = danhSachMaSach.indexOf(maXoa);

                        danhSachMaSach.remove(viTri);

                        danhSachSach.remove(viTri);

                        System.out.println("Xoa sach thanh cong!");

                    } else {

                        System.out.println("Khong tim thay sach!");
                    }

                    break;
                }

                // 5. SUA SACH
                case 5: {

                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = scanner.nextLine();

                    if (danhSachMaSach.contains(maSua)) {

                        int viTri = danhSachMaSach.indexOf(maSua);

                        BTTuan3 sachMoi = new BTTuan3();

                        System.out.println("\nNhap thong tin sach moi:");

                        sachMoi.nhap(scanner);

                        String maMoi = sachMoi.getMaSach();

                        if (!maMoi.equals(maSua)
                                && danhSachMaSach.contains(maMoi)) {

                            System.out.println("Ma sach moi da ton tai!");

                        } else {

                            danhSachMaSach.set(viTri, maMoi);

                            danhSachSach.set(viTri, taoThongTinSach(sachMoi));

                            System.out.println("Sua sach thanh cong!");
                        }

                    } else {

                        System.out.println("Khong tim thay sach can sua!");
                    }

                    break;
                }

                // 6. TINH TONG SO LUONG
                case 6: {

                    int tongSoLuong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {

                        BTTuan3 sach = chuyenThongTinSach(
                                danhSachSach.get(i));

                        tongSoLuong += sach.getSoLuong();
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);

                    break;
                }

                // 7. TINH TONG GIA TRI
                case 7: {

                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {

                        BTTuan3 sach = chuyenThongTinSach(
                                danhSachSach.get(i));

                        tongGiaTri += sach.tinhThanhTien();
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);

                    break;
                }

                // 8. THOAT
                case 8:

                    System.out.println("Da thoat chuong trinh!");

                    break;

                default:

                    System.out.println("Lua chon khong hop le!");

                    break;
            }

        } while (chon != 8);

        scanner.close();
    }

    public static String taoThongTinSach(BTTuan3 sach) {

        return sach.getMaSach() + "|"
                + sach.getTenSach() + "|"
                + sach.getTacGia() + "|"
                + sach.getNamXuatBan() + "|"
                + sach.getDonGia() + "|"
                + sach.getSoLuong() + "|"
                + sach.getLoaiSach();
    }

    public static BTTuan3 chuyenThongTinSach(String thongTin) {

        String[] tt = thongTin.split("\\|");

        BTTuan3 sach = new BTTuan3();

        sach.setMaSach(tt[0]);
        sach.setTenSach(tt[1]);
        sach.setTacGia(tt[2]);
        sach.setNamXuatBan(Integer.parseInt(tt[3]));
        sach.setDonGia(Double.parseDouble(tt[4]));
        sach.setSoLuong(Integer.parseInt(tt[5]));
        sach.setLoaiSach(Integer.parseInt(tt[6]));

        return sach;
    }

    public static void hienThiSach(String thongTin) {

        BTTuan3 sach = chuyenThongTinSach(thongTin);

        sach.xuat();
    }
}
