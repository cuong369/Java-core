package project_abstraction;

public abstract class NhanVien {

	protected String ten;
	protected long luong;

	public NhanVien() {

	}

	public NhanVien(String ten) {
		this.ten = ten;
	}

	public abstract String loaiNhanVien();

	public abstract long tinhLuong();

	public void xuatThongTin() {
		System.out.println("===NhanVien: " + ten + "===");
		System.out.println("- Loại nhân viên: " + loaiNhanVien());
		System.out.println("- Lương: " + tinhLuong() + " VND");
	}
}
