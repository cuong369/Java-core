package project_abstraction;

public class NhanVienFullTime extends NhanVien {

	private int loaiChucVu;
	private int ngayLamThem;

	public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
		this.ten = ten;
		this.ngayLamThem = ngayLamThem;
		this.loaiChucVu = loaiChucVu;
	}

	public String loaiNhanVien() {
		if (loaiChucVu == Config.NHAN_VIEN_SEP) {
			return "Sep toan thoi gian - " + (ngayLamThem > 0 ? "Co lam them" : "");
		} else {
			return "Linh toan thoi gian - " + (ngayLamThem > 0 ? "Co lam them" : "");
		}
	}

	public long tinhLuong() {
		if (loaiChucVu == Config.NHAN_VIEN_SEP) {
			luong = Config.LUONG_NHAN_VIEN_FULL_TIME_SEP + Config.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem;
		} else {
			luong = Config.LUONG_NHAN_VIEN_FULLTIME_LINH + Config.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem;
		}
		return luong;
	}
}
