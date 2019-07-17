package basic_java;

public class WhileAndDoWhile_InJava {

	public static void main(String[] args) {
		int i = 4;
		System.out.println("While in Java");
		while(true) {
			i ++;
			System.out.println(i);
			if(i == 9) {
				break;
			}
		}
		
		System.out.println("Do-While in Java");
		do {
			i --;
			System.out.println(i);
		}while(i != 3);
	}
}
