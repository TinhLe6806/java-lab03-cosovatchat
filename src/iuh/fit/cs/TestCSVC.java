/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 3:08:28 AM
 */
package iuh.fit.cs;
import java.util.ArrayList;
import java.util.List;

public class TestCSVC {

	public static void main(String[] args) {
        List<CoSoVatChat> danhSachCSVC = new ArrayList<>();

        danhSachCSVC.add(new Ghe("G01", ChatLieu.GO, KichCo.NHO, 4, true));
        danhSachCSVC.add(new Ghe("G02", ChatLieu.KIMLOAI, KichCo.LON, 3, false));

        danhSachCSVC.add(new Ban("B01", ChatLieu.NHUA, KichCo.NHO, 4, 1.2, 2.0, 0));
        danhSachCSVC.add(new Ban("B02", ChatLieu.GO, KichCo.LON, 2, 0.8, 1.5, 0));


        System.out.println("Danh sách cơ sở vật chất:");
        System.out.println("\n-----------------DANH SACH BAN-----------------");
		String headerline = String.format("%-8s %-10s %-10s %8s %10s",
				"Mã","Chất Liệu","Kích Cỡ","Số chân","Cân nặng");
		System.out.println(headerline);
        for (CoSoVatChat csvc : danhSachCSVC) {
            if (csvc instanceof Ban) {
                System.out.println(csvc);
            }
        }

        System.out.println("\\n-----------------DANH SACH GHE-----------------");
		String headerline1 = String.format("%-8s %-10s %-10s %8s %-12s %10s",
				"Mã","Chất Liệu","Kích Cỡ","Số chân","Có tựa ghế","Cân nặng");
		System.out.println(headerline1);
        for (CoSoVatChat csvc : danhSachCSVC) {
            if (csvc instanceof Ghe) {
                System.out.println(csvc);
            }
        }


		
//		System.out.println("Mã: " + ban1.getMa());
//		System.out.println("Số chân: " + ban1.getSoChan());
//		System.out.println("Chất liệu: " + ban1.getChatLieu());
//		System.out.println("Kích cỡ: " + ban1.getKichCo());
//		System.out.println("Cân nặng: " + ban1.canNang());
//		System.out.println();
//		
//		System.out.println("Mã: " + ban2.getMa());
//		System.out.println("Số chân: " + ban2.getSoChan());
//		System.out.println("Chất liệu: " + ban2.getChatLieu());
//		System.out.println("Kích cỡ: " + ban2.getKichCo());
//		System.out.println("Cân nặng: " + ban2.canNang());
//		System.out.println();
//		
//		System.out.println("Mã: " + ban3.getMa());
//		System.out.println("Số chân: " + ban3.getSoChan());
//		System.out.println("Chất liệu: " + ban3.getChatLieu());
//		System.out.println("Kích cỡ: " + ban3.getKichCo());
//		System.out.println("Cân nặng: " + ban3.canNang());
//		System.out.println();
//		
//		System.out.println("Mã: " + ghe1.getMa());
//		System.out.println("Số chân: " + ghe1.getSoChan());
//		System.out.println("Chất liệu: " + ghe1.getChatLieu());
//		System.out.println("Kích cỡ: " + ghe1.getKichCo());
//		System.out.println("Trọng lượng của phần tựa ghế: " + ghe1.canNang());
//		System.out.println();
//		
//		System.out.println("Mã: " + ghe2.getMa());
//		System.out.println("Số chân: " + ghe2.getSoChan());
//		System.out.println("Chất liệu: " + ghe2.getChatLieu());
//		System.out.println("Kích cỡ: " + ghe2.getKichCo());
//		System.out.println("Trọng lượng của phần tựa ghế: " + ghe2.canNang());
//		System.out.println();
//		
//		System.out.println("Mã: " + ghe3.getMa());
//		System.out.println("Số chân: " + ghe3.getSoChan());
//		System.out.println("Chất liệu: " + ghe3.getChatLieu());
//		System.out.println("Kích cỡ: " + ghe3.getKichCo());
//		System.out.println("Trọng lượng của phần tựa ghế: " + ghe3.canNang());
//		System.out.println();
//		
//		
        
	}
}
