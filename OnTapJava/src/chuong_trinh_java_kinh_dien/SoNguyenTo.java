package chuong_trinh_java_kinh_dien;

import java.util.Scanner;

public class SoNguyenTo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = sc.nextInt();
		
		SoNguyenTo snt = new SoNguyenTo();
		snt.checkNguyenTo(n);
	}
	
	public void checkNguyenTo(int x) {
		if(x == 2 || x == 3) {
			System.out.println(x + " là số nguyên tố ");
		}else {
			for(int i = 4; i<x; i++) {
				if(x % i != 0) {
					if(i == x -1) {
						System.out.println(x + " là số nguyên tố.");
					}
					continue;
				}else {
					System.out.println(x + " không phải là số nguyên tố.");
					break;
				}
			}
		}
	}

}

/*
 *
	Viết một chương tình java kiểm tra số nguyên tố.
	Input: 44
	Output: không phải là số nguyên tố.
	Input: 7
	Output: là số nguyên tố.
 * */
