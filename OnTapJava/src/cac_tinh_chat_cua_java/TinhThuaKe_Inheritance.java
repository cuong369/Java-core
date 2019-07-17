package cac_tinh_chat_cua_java;

public class TinhThuaKe_Inheritance {

	private int x, y;

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

	public int tinhTong(int x, int y) {
		return x + y;
	}
	
}

class Out extends TinhThuaKe_Inheritance{
	
	public int tinhTich(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		Out z = new Out();
		z.setX(3);
		z.setY(4);
		System.out.println(z.tinhTong(z.getX(),  z.getY()));
		System.out.println(z.tinhTich(z.getX(), z.getY()));
	}
}

/**
 * Kế thừa ở đây là: kế thừa những thuộc tính, phương thức được public từ class, thông qua việc kế thừa ta có thể
 * overide lại một phương thức. Đồng thời, khi muốn phát triển thêm các chức năng ta có thể xây dưng tiếp ở các hàm đỡ 
 * mất thời gian phát triển xây dựng lại một phương thức nào đấy từ class cha
 * */


