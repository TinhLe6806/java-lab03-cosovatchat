/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 3:00:46 AM
 */
package iuh.fit.cs;

abstract class CoSoVatChat {
	private String ma;
	private ChatLieu chatLieu;
	private KichCo kichCo;
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
	public ChatLieu getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(ChatLieu chatLieu) {
		if(!(chatLieu instanceof ChatLieu)) {
			throw new IllegalArgumentException("Chat lieu khong hop le");
		}
		this.chatLieu = chatLieu;
	}
	public KichCo getKichCo() {
		return kichCo;
	}
	public void setKichCo(KichCo kichCo) {
		if(!(kichCo instanceof KichCo)) {
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
	public CoSoVatChat(String ma, iuh.fit.cs.ChatLieu chatLieu, iuh.fit.cs.KichCo kichCo, int soChan) {
		setChatLieu(chatLieu);
		setKichCo(kichCo);
		setMa(ma);
		setSoChan(soChan);
	}

}

