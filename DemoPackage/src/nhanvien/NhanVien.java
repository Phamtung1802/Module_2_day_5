package nhanvien;

public class NhanVien {

    private String MaNV;
    private String TenNV;
    private String PhongBan;
    public static int a=0;

    static {
        System.out.println("ok");
    }

    public NhanVien() {
        this.MaNV = "chua co";
        this.TenNV = "chua co";
        this.PhongBan = "chua co";
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String phongBan) {
        PhongBan = phongBan;
    }


}
