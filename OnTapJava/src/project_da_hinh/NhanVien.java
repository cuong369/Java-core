package project_da_hinh;

public class NhanVien {

	protected String ten;
	protected long luong;

	public NhanVien() {

	}

	public NhanVien(String ten) {
		this.ten = ten;
	}

	protected String loaiNhanVien() {
		// Lớp con phải override để lo vụ loại nhân viên này
		return "";
	}

	public void tinhLuong() {
		// Lớp con phải override để lo vụ tính lương này
	}

	public void xuatThongTin() {
		System.out.println("===NhanVien: " + ten + "===");
		System.out.println("- Loại nhân viên: " + loaiNhanVien());
		System.out.println("- Lương: " + luong + " VND");
	}
}
