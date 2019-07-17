package cac_tinh_chat_cua_java;

// Tính đa hình thể hiện ở việc ta có thể overload (cho viết lại một phương thức trong 1 class theo nhiều ý tưởng)
// ta có thể overide (cho viết lại phương thức của class cha). Vì việc cho viết lại phương thức cho ta nhiều lựa chọn
// để gọi hàm khi ta kế thừa, ta có nhiều lựa chọn để giải quyết công việc = nhiều hàm khác nhau.

/*Quy tắc overload
Khác nhau về số đối số truyền vào và các đối số có cùng kiểu dữ liệu.
Có cùng số đối số truyền vào và các đối số không có cùng kiểu dữ liệu. 
Khác nhau trình tự kiểu dữ liệu của các đối số.
*/
public class TinhDaHinh_Polymorphism {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Bắt đầu thực hiện overload
	public int phepTinh(int x, int y) {
		return x + y;
	}
	
	// Lưu ý: không được cùng kiểu trả về, cùng tham số được. Không được phép đồng thời có 2 cái này.
	
	// Thay đối số lương tham số. Khác nhau về số đối số truyền vào và các đối số có cùng kiểu dữ liệu.
	public int phepTinh(int x, int y, int z) {
		return x * y * z;
	}
	
	// Thay đối kiểu trả về 1 phương thức. Có cùng số đối số truyền vào và các đối số không có cùng kiểu dữ liệu. 
	public double phepTinh(double x, double y) { 
		return x + y;
	}
	
	// Khác nhau trình tự kiểu dữ liệu của các đối số.
	public int phepTinh(int x, float z) {
		return x + (int) z;
	}
	
	// Không được khác kiểu trả về, mà tham số truyền vào về số lượng & kiểu dữ liệu lại giống được
//	public float phepTinh(int x, int y) {
//		return (float) (x + y);
//	}
	
	// Không được cùng kiểu trả về, cùng kiểu - số lượng tham số được - cái này chỉ dành cho overide
//	public int phepTinh(int x, int y) {
//		return x * y;
//	}
	
}
/** Quy tắc overide
- Danh sách các đối số phải giống với phương thức được ghi đè.
- Kiểu trả về phải giống với kiểu trả về được khai báo trong phương thức được ghi đè của lớp cha.
- Mức truy cập của phương thức ghi đè phương thức ở lớp cha không được nhỏ hơn phương thức đó trong lớp cha. Ví dụ: phương thức trong lớp cha được khai báo là public thì phương thức ghi đè phương thức đó trong lớp con không thể có phạm vi truy cập là private hoặc protected.
- Một phương thức được khai báo là final hoặc static thì phương thức không thể được ghi đè.
- Các hàm tạo của lớp cha không thể được ghi đè.
 * */
class A extends TinhDaHinh_Polymorphism{
	public int phepTinh(int x, int y, int z) {
		return x * y * z;
	}
	
	// không được cùng kiểu dữ liệu, cùng số lượng tham số truyền vào mà kiểu dữ liệu trả về lại 
//	public float phepTinh(int x, int y) {
//		return (float) (x + y);
//	}
	
	//=> chỉ được viết lại phương thức lớp cha = việc thực hiện khác đi tý, không được phép thay đổi thuộc tính, 
	//bản chất của phương thức. Được phép thêm một số thuộc tính cùng kiểu dữ liệu
	
	public float phepTinh(float x, float y) {
		return x * y;
	}
}
