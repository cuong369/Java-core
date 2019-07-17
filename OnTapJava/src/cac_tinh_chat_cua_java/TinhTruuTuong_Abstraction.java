package cac_tinh_chat_cua_java;

public class TinhTruuTuong_Abstraction {

	private int thuocTinh1;
	private int thuocTinh2;
	
	public int getThuocTinh1() {
		return thuocTinh1;
	}

	public void setThuocTinh1(int thuocTinh1) {
		this.thuocTinh1 = thuocTinh1;
	}

	public int getThuocTinh2() {
		return thuocTinh2;
	}

	public void setThuocTinh2(int thuocTinh2) {
		this.thuocTinh2 = thuocTinh2;
	}

	public String getThuoctinh4() {
		return thuoctinh4;
	}

	public void setThuoctinh4(String thuoctinh4) {
		this.thuoctinh4 = thuoctinh4;
	}

	private static final String thuocTinh3 = "Const";
	private String thuoctinh4;
	
	public int tinhTong2ThuocTinh(int x, int y) {
		System.out.println("ThuocTinh4" + thuoctinh4);
		return x + y * Integer.parseInt(thuocTinh3);
	}
}

/**
 * Giả sử có ngoài đời có một sự vật Abstraction có các tinh chất đặc điểm được liệt kê (thuoc tinh 1 -> thuoc tinh 4)
 * và nó có hành động (tinhTonh2ThuocTinh)
 * => Như vậy, sự vật Abstraction đã được diễn tả, code hóa thông qua class do ta xây dựng là: TinhTruuTuong_Abstraction 
 * Trừu tượng ở chỗ là từ sự vật hiện tượng đi vào trong code, làm người mới, cũng như trong nghề đôi lúc khó hình dung nên
 * gọi là trừu tượng
 * */
