package basic_java;

// Để format code được đẹp hơn: Ctrl + Shift + F
public class ToanTuTrongJava {

	// Toán tử điều kiện
	public static void main(String[] args) {
		int a = 20;
		int b = 3;

		String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
		System.out.println(s);

		int c = a + 1;
		System.out.println(c % b == 0 ? "c chia hết cho b" : "c không chia hết cho ");
	}
}
