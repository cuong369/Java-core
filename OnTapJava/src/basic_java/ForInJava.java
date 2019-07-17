package basic_java;

public class ForInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
		System.out.println("Hi Hi");
		// for each
		int arr[] = {1, 2, 3, 4, 5};
		for(int j: arr) {
			System.out.println(j);
		}
		System.out.println("Hi Hi => Vòng for gán nhãn");
		/**
		 * ten_nhan:
			for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {  
			    // Khối lệnh được thực thi
			} 
		 * */
		aa: for(int i = 0; i<9; i++) {
			bb: for(int j = 0; j<6; j++) {
				if(i==8) {
					break aa;
				}
				if(j == 5) {
					break bb;
				}
				System.out.println("i: " + i + " & j: " + j);
			}
		}
	}

}
