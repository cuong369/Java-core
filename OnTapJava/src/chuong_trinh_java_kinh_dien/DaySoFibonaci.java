package chuong_trinh_java_kinh_dien;

import java.util.Scanner;

public class DaySoFibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input N: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (true) {
			if (N == 10) {
				break;
			} else {
				System.out.println("Input Again N: ");
			}
		}

		DaySoFibonaci dSFB = new DaySoFibonaci();
		String s = "";
		for (int i = 0; i <= N; i++) {
			s += dSFB.fibonaci(i) + " ";
		}

		System.out.println(s);

	}

	public int fibonaci(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fibonaci(x - 1) + fibonaci(x - 2);
		}
	}
}

/**
 * Viết một chương trình java in ra dãy số Fibonacci không sử dụng đệ quy và có
 * sử dụng đệ quy. Input: 10 Output: 0 1 1 2 3 5 8 13 21 34
 */
