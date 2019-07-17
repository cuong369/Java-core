package basic_java;

public class BreakAndContinueInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; ; i++) {
			System.out.println(i);
			if(i == 9) {
				break;
			}else {
				continue;
			}
		}
	}
}
