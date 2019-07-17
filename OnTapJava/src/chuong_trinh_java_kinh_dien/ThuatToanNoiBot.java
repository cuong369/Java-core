package chuong_trinh_java_kinh_dien;

// Nên đọc ở: javapoint, tham khảo các lời khuyên của Hải (đọc ở javapoint + video jsp/servlet (ducky) + headfirst)...
// Xem video dạy spring mvc của hải.

public class ThuatToanNoiBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cho day so sau: ");
		String s = "18 9 33 4 84 32";
		String [] k = s.split(" ");
		ThuatToanNoiBot tTNB = new ThuatToanNoiBot();
		tTNB.sortArrayNumber(k);
	}
	
	public void sortArrayNumber(String arr[]) {
		String temp;
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if( Integer.parseInt(arr[i])> Integer.parseInt(arr[j])) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		String str = String.join(" ", arr);
		System.out.println(str);
	}

}

/**
 * Viết một chương trình java để sắp xếp dãy số bằng cách sử dụng thuật toán nổi bọt.
Input: 18 9 33 4 84 32
Output: 4 9 18 32 33 84
 * */
