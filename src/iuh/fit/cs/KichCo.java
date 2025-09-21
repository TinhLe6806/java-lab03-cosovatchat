/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 2:54:41 AM
 */
package iuh.fit.cs;

public enum KichCo {
	NHO("Nhỏ"),
	VUA("Vừa"),
	LON("Lớn");
	private String kichCo;
	private KichCo(String kichCo) {
		this.kichCo = kichCo;
	}
	@Override
	public String toString() {
		return kichCo;
	}
}

