package interface_in_java;

// Một class có thể implement nhiều interface, chúng được ngăn cách nhau bởi dấu phẩy.
public class Interface implements A, B, C{

	@Override
	public void print3() {
		// TODO Auto-generated method stub
		System.out.println("Hello C");
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("Hello B");
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("Hello A");
	}
	
	public static void smile() {
		System.out.println("From java 8. Interfaces can have static methods!!!");
	}

}

interface A{
	void print1();
}

interface B{
	void print2();
}

interface C{
	void print3();
}

// Một interface có thể extends nhiều interface khác nhau, chúng được ngăn cách bởi dấu phẩy.
interface D extends A, B, C{
	void print4();
}

// 1 class có thể vừa extends 1 class khác, lại vừa implement nhiều interface khác.
class E extends Interface implements A, B, D{

	@Override
	public void print4() {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void print1() {
//		// TODO Auto-generated method stub
//		super.print1();
//	}
//	@Override
//	public void print2() {
//		// TODO Auto-generated method stub
//		super.print2();
//	}
//	@Override
//	public void print3() {
//		// TODO Auto-generated method stub
//		super.print3();
//	}
//	@Override
//	public void print4() {
//		// TODO Auto-generated method stub
//		
//	}
}

class F extends E{
	void test() {
		System.out.println("Test class F có extends được nhiều class khác không?");
		System.out.println("Không. Một class chỉ extends 1 class khác, không extends được nhiều class cùng lúc");
	}
}

class P
{
    interface Q
    {
        int i = 111;
    }
}

//Note: Hay
/*
 * 5) Why the below code is showing compile time error?

interface X
{
    void methodX();
}
 
class Y implements X
{
    void methodX()
    {
        System.out.println("Method X");
    }
}
View Answer
Answer :
Interface methods must be implemented as public. Because, interface methods are public by default and 
you should not reduce the visibility of any methods while overriding.
 * */

// Note2:
/*
 * How do you access interface field ‘i’ in the below code?

class P
{
    interface Q
    {
        int i = 111;
    }
}
View Answer
Answer :
P.Q.i
*/
