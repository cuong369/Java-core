package system_manage_products;

import java.util.ArrayList;
import java.util.Scanner;


public class Shop {
	
//	private String name;
//	private String mota;
//	private float gia;

	ArrayList<Products> listProducts = new ArrayList<Products>();
	Scanner sc = new Scanner(System.in);
	// chú ý không khai báo các biến (name, description, sales) nữa mà ta gọi (setname, ...) để
	// truyền thẳng giá trị vào luôn
	void addProducts() {
		Products p = new Products();
		System.out.print("Input name of products: ");
//		name = sc.nextLine();
		p.setName(sc.nextLine());
		System.out.print("Description products: ");
//		mota = sc.nextLine();
		p.setDescription(sc.nextLine());
		System.out.print("Sales of products: ");
//		gia = Float.parseFloat(sc.nextLine());
		p.setSales(Float.parseFloat(sc.nextLine()));
		
//		p.setName(name);
//		p.setDescription(mota);
//		p.setSales(gia);
		
		listProducts.add(p);
		// tại sao add thành công ở đây mà ở dưới lại là 1 list rỗng nhỉ? vì bạn khởi tạo một
		//đối tượng trong vòng lặp do-while bên file Main.
	}
	
	void detailProducts() {
		System.out.println(listProducts);
		if(listProducts.size() == 0) {
			System.out.println("List Products is null !!!");
		}else {
			for(Products p: listProducts) {
				p.wathProducts();
			}
		}
	}
	
	void findProducts() {
		System.out.println("Input name of products which you want to find!");
		String nameProducts = sc.nextLine();
		System.out.println("Find products follow name of products");
		for(Products p: listProducts) {
			if(nameProducts.equals(p.getName())){
				p.wathProducts();
			}
		}
		System.out.println("Find products follow sales between a and b.");
		System.out.print("Input a: ");
		float a = sc.nextFloat();
		System.out.print("Input b: ");
		float b = sc.nextFloat();
		for(Products p: listProducts) {
			if(p.getSales()>=a && p.getSales()<=b) {
				p.wathProducts();
			}
		}
	}
	
	void deleteProduct() {
		aa: while(true) {
			System.out.println("Input name of product which you want to delete it.");
			String name = sc.nextLine();
			for(Products p: listProducts) {
				if(name.equals(p.getName())) {
					listProducts.remove(p);
					break aa;
				}
			}
		}
	}
	
}
