
import java.util.Scanner;

public class BTTuan5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BTTuan3 sachCuoi = null;

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        int chon;
        boolean daNhapSach = false;

        // Menu 
        do {

            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Xuat sach vua nhap gan nhat");
            System.out.println("3. Tinh tong so luong va tong gia tri sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.println("======================================");

            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {

                // BAI 1: NHAP N SACH BANG VONG LAP
                case 1:

                    int n;

                    do {
                        System.out.print("Số lượng sách cần nhập: ");
                        n = scanner.nextInt();
                        scanner.nextLine();

                        if (n <= 0) {
                            System.out.println("Số lượng sách phải lớn hơn 0!");
                        }

                    } while (n <= 0);

                  
                    tongSoLuong = 0;
                    tongGiaTri = 0;

                    // Nhap ma sach can tim
                    System.out.print("Nhap ma sach can tim (Enter de bo qua): ");
                    String maTim = scanner.nextLine();

                    boolean timThay = false;

              
                    for (int i = 1; i <= n; i++) {

                        System.out.println("\n===== NHAP SACH THU " + i + " =====");

                        BTTuan3 sach = new BTTuan3();

                        sach.nhap(scanner);

                   
                        sachCuoi = sach;

                        // BAI 2: TINH TONG SO LUONG VA TONG GIA TRI
                        tongSoLuong += sach.getSoLuong();

                        tongGiaTri += sach.tinhThanhTien();

                        daNhapSach = true;

                        // BAI 4: TIM SACH TRONG LUC NHAP
                        if (!maTim.equals("")
                                && sach.getMaSach().equals(maTim)) {

                            System.out.println("\nDa tim thay sach!");

                            sach.xuat();

                            timThay = true;
                        }
                    }

                    // Thong bao ket qua tim kiem
                    if (!maTim.equals("") && timThay == false) {

                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }

                    System.out.println("\nDa nhap xong danh sach sach!");

                    break;


                // XUAT THONG TIN SACH VUA NHAP GAN NHAT
                case 2:

                    if (daNhapSach == false) {

                        System.out.println("Chua nhap sach!");

                    } else {

                        System.out.println("\n===== THONG TIN SACH =====");

                        sachCuoi.xuat();
                    }

                    break;


                // BAI 2: TINH TONG SO LUONG VA TONG GIA TRI
                case 3:

                    if (daNhapSach == false) {

                        System.out.println("Chua nhap sach!");

                    } else {

                        System.out.println("\n===== THONG KE SACH =====");

                        System.out.println("Tong so luong sach: " + tongSoLuong);

                        System.out.println("Tong gia tri sach: " + tongGiaTri);
                    }

                    break;


                // BAI 4: TIM SACH THEO MA
                case 4:

                    System.out.println("Chuc nang tim kiem sach");

                    System.out.println("Chuong trinh chi tim kiem trong luc nhap sach");

                    System.out.println("Vui long chon lai");

                    break;

                case 0:

                    System.out.println("Da thoat chuong trinh!");

                    break;


                default:

                    System.out.println("Lua chon khong hop le!");

                    break;
            }

        } while (chon != 0);

        scanner.close();
    }
}
