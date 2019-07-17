package abstraction;

public abstract class AbstractClass {

	abstract void run();
	
//	abstract static void smile(); => Không thể có 1 phương thức abstract là (static)
}

class Honda extends AbstractClass{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Runing safely ...");
	}
	
	public static void main(String[] args) {
		AbstractClass a = new Honda();
		a.run();
	}
}

