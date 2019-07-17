package ep_kieu_trong_oop;

// Ép kiểu tường minh: khi mà hệ thống thấy bạn đang muốn chuyển dữ liệu từ kiểu dữ liệu có kích thước lớn hơn sang kiểu 
// dữ liệu có kích thước nhỏ hơn. Với OOP: từ lớp cha sang lớp con.
// ==> lúc này ta phải chuyển đối tượng cha sang đối tượng con: nhanVien = new NhanVienFullTime1();
// ==> sau đó thực hiện việc ép kiểu: Nhận xét, ta phải chuyển đổi để 2 đối tượng mà ta muốn ép kiểu cho nhau phải là đối
// tượng của 1 lớp. vì vậy, ép kiểu tường minh này nghĩa là một dạng khác của ép kiểu ngầm định, chuyển đổi về cùng 1 đối tượng
// của 1 lớp rồi mới ép kiểu.
public class EpKieuTuongMinh {

	/* đoạn code được comment dưới đây, sẽ báo lỗi nhé, không được ép kiểu như thế 
	public static void main(String[] args) {
        // Khai báo hai đối tượng nhanVien1 và nhanVien2 từ một lớp NhanVien
        NhanVien nhanVien = new NhanVien();
        NhanVienFullTime nhanVienFullTime = new NhanVienFullTime();
         
        // Set tên cho hai nhân viên
        nhanVien.setTen("Hùng");
        nhanVienFullTime.setTen("Trang");
         
        // Xuất thông tin hai đối tượng lần 1 
        nhanVien.xuatThongTin();            // In ra "Nhân viên: Hùng"
        nhanVienFullTime.xuatThongTin();    // In ra "Nhân viên toàn thời gian: Trang"
         
        // Ép kiểu tường minh từ NhanVien sang NhanVienFullTime
        nhanVienFullTime = (NhanVienFullTime) nhanVien;
    }
    */
	public static void main(String[] args) {
		 // Khai báo hai đối tượng nhanVien1 và nhanVien2 từ một lớp NhanVien
        NhanVien2 nhanVien = new NhanVien2();
        NhanVienFullTime1 nhanVienFullTime = new NhanVienFullTime1();
         
        // Set tên cho hai nhân viên
        nhanVien.setName("Hùng");
        nhanVienFullTime.setName("Trang");
         
        // Xuất thông tin hai đối tượng lần 1 
        nhanVien.xuatThongTin();            // In ra "Nhân viên: Hùng"
        nhanVienFullTime.xuatThongTin();    // In ra "Nhân viên toàn thời gian: Trang"
         
        // Ép kiểu tường minh từ NhanVien sang NhanVienFullTime, nhưng NhanVien phải có tính đa hình trước đó
        nhanVien = new NhanVienFullTime1(); // ========> cho thêm dòng này thì mới đúng, hết lỗi. Lúc này đối tượng Nhân Viên
        // sẽ trở thành một đối tượng mới của (NhanVienFullTime1) 
        nhanVienFullTime = (NhanVienFullTime1) nhanVien; //do có dòng trên nên việc ép kiểu ở đây tương tự như ép kiểu ngầm định
         
        // Thay đổi thông tin giá trị ten bên trong nhanVien
        nhanVien.setName("Khải");
         
        // Xuất thông tin hai đối tượng lần 2
        nhanVien.xuatThongTin();            // In ra "Nhân viên toàn thời gian: Khải"
        nhanVienFullTime.xuatThongTin();    // In ra "Nhân viên toàn thời gian: Khải"
	}
}

class NhanVienFullTime1 extends NhanVien2{
	
	public void xuatThongTin() {
		System.out.println("Employee FullTime: " + name);
	}
}

class NhanVien2 {
	
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
