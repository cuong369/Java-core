package ep_kieu_trong_oop;

public class EpKieuNgamDinhTuLopConSangLopCha {

	public static void main(String[] args) {
		NhanVien1 nhanVien = new NhanVien1();
		NhanVienFullTime nhanVienFullTime = new NhanVienFullTime();
		
		//set name for 2 employees
		nhanVien.setName("Hung");
		nhanVienFullTime.setName("Trang");
		
		//output data once (Hung, Trang)
		nhanVien.xuatThongTin();
		nhanVienFullTime.xuatThongTin();
		
		//Ép kiểu ngầm định từ NhanVienFullTime về NhanVien (từ lớp con ép sang lớp cha), hoàn toàn tự động
		nhanVien = nhanVienFullTime;
		
		//xuất thông tin hai đối tượng lần 2 (Trang, Trang)
		nhanVien.xuatThongTin();
		nhanVienFullTime.xuatThongTin();
		
		//thay đối thông tin giá trị biến name bên trong NhanVien
		nhanVien.setName("Khải");
		
		//xuất thông tin hai đối tượng lần 3 (Khải, Khải)
		nhanVien.xuatThongTin();
		nhanVienFullTime.xuatThongTin();
	}
}

class NhanVienFullTime extends NhanVien1{
	
	public void xuatThongTin() {
		System.out.println("Employee FullTime: " + name);
	}
}

class NhanVien1 {
	
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void xuatThongTin() {
		System.out.println("Employee: " + name);
	}
}