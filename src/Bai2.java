import java.util.Arrays;

class LopHocPhan {
    protected String maLHP;
    protected String tenLHP;
    protected String tenGV;
    protected String thongTinLopHoc;
    private SinhVien[] dsSV;

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = dsSV;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public SinhVien[] getDsSV() {
        return dsSV;
    }

    public void setDsSV(SinhVien[] dsSV) {
        this.dsSV = dsSV;
    }

    public int getSoLuongSV() {
        return dsSV.length;
    }

    @Override
    public String toString() {
        String s = "Ma LHP: " + maLHP + "\n";
        s += "Ten LHP: " + tenLHP + "\n";
        s += "Ten GV: " + tenGV + "\n";
        s += "Thong tin lop hoc: " + thongTinLopHoc + "\n";
        s += "Danh sach sinh vien:\n";
        for (SinhVien sv : dsSV) {
            s += sv.toString() + "\n";
        }
        s += "Tong so sinh vien: " + getSoLuongSV() + "\n";
        return s;
    }
}

class SinhVien extends LopHocPhan {
    private String maSV;
    private String hoTen;

    public SinhVien(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV, String maSV, String hoTen) {
        super(maLHP, tenLHP, tenGV, thongTinLopHoc, dsSV);
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSV + "\nHọ tên: " + hoTen + "\nMã lớp học phần: " + maLHP + "\n"+ "\nTên lớp học phần: " + tenLHP + "\nTên giảng viên: " + tenGV + "\nThông tin lớp học: " + thongTinLopHoc;
    }
    public static void main(String[] args) {
        
        SinhVien[] dsSV = { new SinhVien("123", "NguyenVanA", new SinhVien("543", "Le Thi B"), new SinhVien("321", "Luong Van C") };
        LopHocPhan lhp = new LopHocPhan("123456", "LT huongDoituong", "NguyenVanA", "thứ 7 tiết 4-6 phòng A1.1", dsSV);

        
        System.out.println(lhp.toString());

       
        for (SinhVien sv : lhp.dsSV) {
            System.out.println(sv.toString());
        }
    }

    
}
