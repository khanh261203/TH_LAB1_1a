package Bai1b;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HangThucPham> danhSachHangHoa = new ArrayList<>();

        System.out.print("Nhập số lượng hàng hóa: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Nhập thông tin hàng hóa thứ %d:\n", i + 1);

            System.out.print("Nhập mã hàng: ");
            String maHang = scanner.nextLine();

            System.out.print("Nhập tên hàng: ");
            String tenHang = scanner.nextLine();

            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Nhập ngày sản xuất (yyyy-MM-dd): ");
            LocalDate ngaySanXuat = LocalDate.parse(scanner.nextLine());

            System.out.print("Nhập ngày hết hạn (yyyy-MM-dd): ");
            LocalDate ngayHetHan = LocalDate.parse(scanner.nextLine());

            HangThucPham hangHoa = new HangThucPham(maHang, tenHang, donGia, ngaySanXuat, ngayHetHan);
            danhSachHangHoa.add(hangHoa);
        }

        System.out.println("Danh sách hàng hóa:");
        for (HangThucPham hangHoa : danhSachHangHoa) {
            System.out.printf("- Mã hàng: %s, tên hàng: %s, đơn giá: %.0f, ngày sản xuất: %s, ngày hết hạn: %s\n",
                    hangHoa.getMaHang(), hangHoa.getTenHang(), hangHoa.getDonGia(),
                    hangHoa.getNSX(), hangHoa.getNHH());
        }
    }
}

