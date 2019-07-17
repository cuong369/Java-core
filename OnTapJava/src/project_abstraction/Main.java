package project_abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<NhanVien> nhanvien = new ArrayList<NhanVien>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin nhan vien");
		aa: while(true) {
			System.out.println("Ban nhap loai nhan vien nao: 1. fulltime - 2. part time");
			int choose = Integer.parseInt(sc.nextLine());
			
			switch (choose){
				case 1:
					System.out.println("Nhap chuc vu: 1. Sep - 2. Linh");
					int chon = Integer.parseInt(sc.nextLine());
					switch(chon) {
						case 1:
							System.out.print("Nhap ten sep: ");
							String nameSep = sc.nextLine();
							System.out.print("Nhap so ngay lam them: ");
							int ngayLamThem = Integer.parseInt(sc.nextLine());
							NhanVien nvfts = new NhanVienFullTime(nameSep, ngayLamThem, chon);
							nhanvien.add(nvfts);
							break;
						case 2:
							System.out.print("Nhap ten linh: ");
							String nameLinh = sc.nextLine();
							System.out.print("Nhap so ngay lam them: ");
							int outTime = Integer.parseInt(sc.nextLine());
							NhanVien nvftl = new NhanVienFullTime(nameLinh, outTime, chon);
							nhanvien.add(nvftl);
							break;
						default:
							System.out.println("Nhap lai: 1 - Sep, 2 - Linh");
					}
					break;
				case 2:
					System.out.print("Nhap ten nhan vien part time: ");
					String namePartTime = sc.nextLine();
					System.out.print("Nhap so gio lam: ");
					int gioLamViec = Integer.parseInt(sc.nextLine());
					NhanVien nvpt = new NhanVienPartTime(namePartTime, gioLamViec);
					nhanvien.add(nvpt);
					break;
				default:
					
					System.out.println("Moi nhap lai: 1. full time - 2. part time");
			}
			System.out.println("Ban co muon nhap them nhan vien nua khong? y/n: ");
			String luachon = sc.nextLine();
			if("n".equals(luachon)) {
				break aa;
			}else {
				continue;
			}
		}
		sc.close();
		System.out.println("Detail employees: ");
		for(NhanVien nv: nhanvien) {
			nv.xuatThongTin();
		}
	}
}
