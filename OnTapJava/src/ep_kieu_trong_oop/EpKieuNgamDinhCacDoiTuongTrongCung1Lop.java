package ep_kieu_trong_oop;

// Ép kiểu ngầm định: là hệ thống nhận thấy bạn muốn chuyển đổi kiểu dữ liệu từ kích thước nhỏ sang kiểu dữ liệu có kích
// thước lớn.
public class EpKieuNgamDinhCacDoiTuongTrongCung1Lop {

	public static void main(String[] args) {
		// khai báo 2 đối tượng nhanvien1 và nhanvien2 từ một lớp nhân viên 
		NhanVien nhanvien1 = new NhanVien();
		NhanVien nhanvien2 = new NhanVien();
		
		// set tên cho 2 đối tượng 
		nhanvien1.setTen("Hung");
		nhanvien2.setTen("Trang");
		
		// xuất thông tin 2 đối tượng lần 1 (kết quả: Hùng, Trang)
		System.out.println("Nhân viên 1: " + nhanvien1.getTen());
		System.out.println("Nhân viên 2: " + nhanvien2.getTen());
		
		// Gán 2 đối tượng nhân viên, hệ thống sẽ ép kiểu ngầm định nhân viên 1 về nhân viên 2 
		nhanvien2 = nhanvien1;
		
		// Xuất thông tin 2 đối tượng lần 2: (kết quả: Trang, Trang)
		System.out.println("Nhân viên 1: " + nhanvien1.getTen());
		System.out.println("Nhân viên 2: " + nhanvien2.getTen());
		
		// tiến hành set tên cho đối tượng nhân viên 2. quan sát kết quả
		nhanvien2.setTen("Khải");
		
		// xuất thông tin 2 đối tượng lần 3: (kết quả: Khải, Khải)
		System.out.println("Nhân viên 1: " + nhanvien1.getTen());
		System.out.println("Nhân viên 2: " + nhanvien2.getTen());
		
		
		// kết luận: khi tiến hành ép kiểu 2 đối tượng của 1 class thì, mọi thay đổi trên đối tượng này sẽ ảnh hưởng đến
		// đối tượng còn lại. lúc này tuy 2 mà là 1, 2 đối tượng (nhanvien1 và nhanvien2) sẽ được đồng nhất, hợp thể được coi là 1
	}
}

class NhanVien{
	protected String ten;
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public void xuatThongTin() {
		System.out.println("Employee: " + ten);
	}
}
