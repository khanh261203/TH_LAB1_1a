package Bai1b;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class HangThucPham {
	private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate NSX;
    private LocalDate NHH;
	public HangThucPham(String maHang) {
		this.maHang = maHang;
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate nSX, LocalDate nHH) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		NSX = nSX;
		NHH = nHH;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public LocalDate getNSX() {
		return NSX;
	}
	public void setNSX(LocalDate nSX) {
		NSX = nSX;
	}
	public LocalDate getNHH() {
		return NHH;
	}
	public void setNHH(LocalDate nHH) {
		NHH = nHH;
	}
	public boolean daHetHan() {
		return LocalDate.now().isAfter(ngayHetHan);
    }
	
    public static void main(String[] args) {
    	
    	
    	        Scanner scanner = new Scanner(System.in);
    	        ArrayList<HangThucPham> danhSachHangHoa = new ArrayList<>();

    	        System.out.print("Nhập số lượng hàng hóa: ");
    	        int soLuong = scanner.nextInt();
    	        scanner.nextLine(); // đọc bỏ kí tự '\n' sau khi nhập số lượng

    	        for (int i = 0; i < soLuong; i++) {
    	            System.out.printf("Nhập thông tin hàng hóa thứ %d:\n", i + 1);

    	            System.out.print("Nhập mã hàng: ");
    	            String maHang = scanner.nextLine();

    	            System.out.print("Nhập tên hàng: ");
    	            String tenHang = scanner.nextLine();

    	            System.out.print("Nhập đơn giá: ");
    	            double donGia = scanner.nextDouble();
    	            scanner.nextLine(); // đọc bỏ kí tự '\n' sau khi nhập đơn giá

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
    	                    hangHoa.getNgaySanXuat(), hangHoa.getNgayHetHan());
    	        }
    	    
    	

    	
    }
    
}