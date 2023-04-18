import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Dsach d = new Dsach();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1. nhap thong tin va tao cac doi tuong xe1,xe2,xe3");
			System.out.println("2. xuat ban ke khai tien thue truoc ba cua cac xe");
			System.out.println("3. thoat");
			int chon=0;
			chon = sc.nextInt();
			//int chon =0;
			if(chon==1) {
				
				d.Them();
				
			}
			else if(chon==2) {
				System.out.println("chutaixe"+"\t\t"+"loaixe"+"\t\t"+"dungtich"+"\t\t"+"gia"+"\t\t"+"thuephaidong");
				d.xuat();
				
			}
			if(chon==3)
				break;
			
		}
		
	}
}
