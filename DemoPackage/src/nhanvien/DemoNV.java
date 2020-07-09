package nhanvien;

public class DemoNV {
    public static void main(String[] args) {
        NhanVien NhanVien=new NhanVien();
        System.out.println("Ma NV: "+ NhanVien.getMaNV()+ " Phong Ban: "+ NhanVien.getPhongBan()+ " Ten NV: "+ NhanVien.getTenNV());
        NhanVien.setMaNV("A2");
        NhanVien.setPhongBan("Sale");
        NhanVien.setTenNV("Hai");
        System.out.println("Ma NV: "+ NhanVien.getMaNV()+ " Phong Ban: "+ NhanVien.getPhongBan()+ " Ten NV: "+ NhanVien.getTenNV());
    }
}
