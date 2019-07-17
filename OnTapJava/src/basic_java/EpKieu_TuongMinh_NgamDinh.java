package basic_java;

public class EpKieu_TuongMinh_NgamDinh{

	public static void main(String[] args) {
		//Ép kiểu ngầm định 
		int i = 100;
		long l = i; // không yêu cầu chỉ định ép kiểu
		float f = l; // không yêu cầu chỉ định ép kiểu
		System.out.println("Giá trị Int: " + i);
		System.out.println("Giá trị Long: " + l);
		System.out.println("Giá trị Float: " + f);
		
		// Ép kiểu tường minh
		double d = 100.4;
		long k = (long) d; // Yêu cầu chỉ định kiểu dữ liệu (long)
		int j = (int) k; // Yêu cầu chỉ định kiểu dữ liệu (int)
		System.out.println("Giá trị Double: " + d);
		System.out.println("Giá trị Long: " + k);
		System.out.println("Giá trị Int: " + j);
	}
	
}
