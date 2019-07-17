package project_da_hinh;

public class NhanVienPartTime extends NhanVien{

	private int gioLamViec;
	
	public NhanVienPartTime(String ten, int gioLamViec) {
		this.gioLamViec = gioLamViec;
	}
	
	public String loaiNhanVien() {
		return "Nhan vien part time";
	}
	
	public void tinhLuong() {
		luong = Config.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
	}
}
