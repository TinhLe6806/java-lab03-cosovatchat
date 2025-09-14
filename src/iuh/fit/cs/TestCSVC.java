/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 3:08:28 AM
 */
package iuh.fit.cs;

public class TestCSVC {

	public static void main(String[] args) {
		Ban ban1 = new Ban("B001",chatLieu.GO, kichCo.VUA, 4, 10.5, 5, 0);
		Ban ban2 = new Ban("B002",chatLieu.KIMLOAI, kichCo.NHO, 6, 5.5, 5, 0);
		Ban ban3 = new Ban("B003",chatLieu.NHUA, kichCo.LON, 10, 10.5, 5, 0);
		
		Ghe ghe1 = new Ghe("G001", chatLieu.GO, kichCo.VUA, 4, true);
		Ghe ghe2 = new Ghe("G002", chatLieu.KIMLOAI, kichCo.LON, 5, false);
		Ghe ghe3 = new Ghe("G003", chatLieu.NHUA, kichCo.NHO, 6, true);
		
		System.out.println("Mã: " + ban1.getMa());
		System.out.println("Số chân: " + ban1.getSoChan());
		System.out.println("Chất liệu: " + ban1.getChatLieu());
		System.out.println("Kích cỡ: " + ban1.getKichCo());
		System.out.println("Cân nặng: " + ban1.canNang());
		System.out.println();
		
		System.out.println("Mã: " + ban2.getMa());
		System.out.println("Số chân: " + ban2.getSoChan());
		System.out.println("Chất liệu: " + ban2.getChatLieu());
		System.out.println("Kích cỡ: " + ban2.getKichCo());
		System.out.println("Cân nặng: " + ban2.canNang());
		System.out.println();
		
		System.out.println("Mã: " + ban3.getMa());
		System.out.println("Số chân: " + ban3.getSoChan());
		System.out.println("Chất liệu: " + ban3.getChatLieu());
		System.out.println("Kích cỡ: " + ban3.getKichCo());
		System.out.println("Cân nặng: " + ban3.canNang());
		System.out.println();
		
		System.out.println("Mã: " + ghe1.getMa());
		System.out.println("Số chân: " + ghe1.getSoChan());
		System.out.println("Chất liệu: " + ghe1.getChatLieu());
		System.out.println("Kích cỡ: " + ghe1.getKichCo());
		System.out.println("Trọng lượng của phần tựa ghế: " + ghe1.nangNangCuaTuaGhe());
		System.out.println();
		
		System.out.println("Mã: " + ghe2.getMa());
		System.out.println("Số chân: " + ghe2.getSoChan());
		System.out.println("Chất liệu: " + ghe2.getChatLieu());
		System.out.println("Kích cỡ: " + ghe2.getKichCo());
		System.out.println();
		
		System.out.println("Mã: " + ghe3.getMa());
		System.out.println("Số chân: " + ghe3.getSoChan());
		System.out.println("Chất liệu: " + ghe3.getChatLieu());
		System.out.println("Kích cỡ: " + ghe3.getKichCo());
		System.out.println("Trọng lượng của phần tựa ghế: " + ghe3.nangNangCuaTuaGhe());
		System.out.println();
		
		
		System.out.println("\n-----------------DANH SACH BAN-----------------");
		String headerline = String.format("%-10s %-10s %10s %5s %10s",
				"Mã","Số chân","Chất liệu","Kích cỡ","Cân nặng");
		System.out.println(headerline);
		System.out.println(String.format("%-10s %-10s %10s %5s %10s", 
				ban1.getMa(),ban1.getSoChan(),ban1.getChatLieu(),ban1.getKichCo(),ban1.canNang()));
		
		System.out.println("\n-----------------DANH SACH GHE-----------------");
		System.out.println(headerline);
		System.out.println(String.format("%-10s %-10s %10s %5s %10s", 
				ghe1.getMa(),ghe1.getSoChan(),ghe1.getChatLieu(),ghe1.getKichCo(),ghe1.canNang()));
	}

}
