import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
	private String chuTaiXe;
	private String loaiXe;
	private int dungTich;
	private double gia;
	private double thuePhaiDong;
	public Vehicle() {
	}
	public Vehicle(String chuTaiXe, String loaiXe, int dungTich, double gia,double thuePhaiDong) {
		this.chuTaiXe = chuTaiXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.gia = gia;
		this.thuePhaiDong=thuePhaiDong;
	}
	public String getChuTaiXe() {
		return chuTaiXe;
	}
	public void setChuTaiXe(String chuTaiXe) {
		this.chuTaiXe = chuTaiXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}


	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chu tai xe:");
		chuTaiXe=sc.nextLine();
		System.out.println("nhap loai xe:");
		loaiXe=sc.nextLine();
		System.out.println("nhap dung tich:");
		dungTich=sc.nextInt();
		System.out.println("nhap don gia");
		gia=sc.nextDouble();
		
	}
	public double getThuePhaiDong(){
		if(dungTich<100)
			 return 0.01*gia;
		if(dungTich>=100&&dungTich<=200) 
			return 0.03*gia;
		return 0.05*gia;
	}
	public void xuat() {
	
			System.out.println(getChuTaiXe()+"\t\t"+getLoaiXe()+"\t\t"+getDungTich()+"\t\t"+getGia()+""
					+ "\t\t"+getThuePhaiDong());
		}
		
	}
	
	

