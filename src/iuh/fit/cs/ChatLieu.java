/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 2:54:01 AM
 */
package iuh.fit.cs;

public enum ChatLieu {
	GO("Gỗ"),
	NHUA("Nhựa"),
	KIMLOAI("Kim loại");
	private String chatLieu;
	private ChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}
	@Override
	public String toString() {
		return chatLieu;
	}
}
