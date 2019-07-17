package cac_tinh_chat_cua_java;

/**
 * Tính đóng gói: nghĩa nó nó sẽ gói các thuộc tính, phương thức vào trong một lớp để diễn đạt, mô tả một sự vật - hiện
 * tượng mang tính trừu tượng thông qua một class do ta xây dựng. Và ta còn có thể gom nhóm gói gọn các class vào trong
 * 1 package, gói các package vào trong 1 project cho một dự 
 * */
public class TinhDongGoi_Encapsulation {

	private int x;
	private int y;
	private static final int z = 3;
	
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
	
	public static void main(String[] args) {
		TinhDongGoi_Encapsulation tDGE = new TinhDongGoi_Encapsulation();
		int k = tDGE.tinhTong(3, 4);
		if(z == k) {
			System.out.println("Supprice!!!");
		}else {
			System.out.println("Hihi!!!");
		}
	}
}
