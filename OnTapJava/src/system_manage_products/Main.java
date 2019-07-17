package system_manage_products;

import java.util.Scanner;

public class Main {
	
	static {
		System.out.println("MANAGE SYSTEM PRODUCTS");
		System.out.println("**********************");
		System.out.println("1. Add product");
		System.out.println("2. Detail products");
		System.out.println("3. Find product");
		System.out.println("4. Delete product");
		System.out.println("5. Exit");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shop s = new Shop(); // không được để thằng này trong vòng lặp do-while. vì mỗi lần
		//lặp nó lại tạo mới, refresh 1 đối tượng Shop nên (listProducts = rỗng)
		boolean check = true;
		do {
			System.out.print("Select options: ");
			int options = Integer.parseInt(sc.nextLine());
			switch (options) {
			case 1:
				s.addProducts();
				break;
			case 2:
				s.detailProducts();
				break;
			case 3:
				s.findProducts();
				break;
			case 4:
				s.deleteProduct();
				break;
			case 5:
				System.out.println("Exit Program!");
				check = false;
				System.exit(0);
				break;
			default:
				System.out.println("Select again!");
				break;
			}
		}while(check);
		sc.close();
	}
}
