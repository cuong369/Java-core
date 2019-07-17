package regex_in_java;

public class DemoRegex {
	
	public static void main(String[] args) {
		String mau1 = "[DC]\\d{2}(CN|DT|KT)\\d{1,4}";
		String s = "D12CN344";
		if(s.matches(mau1)) {
			System.out.println("ok!!!");
		}else {
			System.out.println("not ok!!!");
		}
	}
}
