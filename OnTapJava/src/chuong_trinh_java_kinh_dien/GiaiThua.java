package chuong_trinh_java_kinh_dien;

import java.util.Scanner;

public class GiaiThua {

	public static void main(String[] args) {
		System.out.println("Input any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GiaiThua gt = new GiaiThua();
		System.out.println(gt.tinhGiaiThua(n));
		sc.close();
	}
	
	public int tinhGiaiThua(int x) {
		if(x == 0) {
			return 0;
		}
		int temp = 1;
		for(int i = 1; i<=x; i++) {
			temp *= i;
		}
		return temp;
	}
}

/**
 * 
 * Viết một chương trình java tính giai thừa của một số không sử dụng đệ quy và có sử dụng đệ quy.
Input: 0
Output: 1
Input: 5
Output: 120
*/
