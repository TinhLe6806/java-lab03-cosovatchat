/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 3:00:46 AM
 */
package iuh.fit.cs;

abstract class CoSoVatChat {
	private String ma;
	private chatLieu chatLieu;
	private kichCo kichCo;
	private int soChan;
	public abstract double canNang();
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		if(ma == null || ma.isEmpty()) {
			throw new IllegalArgumentException("Ma khong duoc de trong");
		}
		this.ma = ma;
	}
	public chatLieu getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(chatLieu chatLieu) {
		this.chatLieu = chatLieu;
	}
	public kichCo getKichCo() {
		return kichCo;
	}
	public void setKichCo(kichCo kichCo) {
		if(kichCo == null) {
			throw new IllegalArgumentException("Kich co khong duoc null");
		}
		this.kichCo = kichCo;
	}
	public int getSoChan() {
		return soChan;
	}
	public void setSoChan(int soChan) {
		if(soChan < 0) {
			throw new IllegalArgumentException("So chan khong duoc < 0");
		}
		this.soChan = soChan;
	}
	public CoSoVatChat(String ma, iuh.fit.cs.chatLieu chatLieu, iuh.fit.cs.kichCo kichCo, int soChan) {
		setChatLieu(chatLieu);
		setKichCo(kichCo);
		setMa(ma);
		setSoChan(soChan);
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %10s %5s %10s", ma,chatLieu,kichCo,soChan,canNang());
	}
	
}
