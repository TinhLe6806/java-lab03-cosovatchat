/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 2:51:57 AM
 */
package iuh.fit.cs;

class Ban extends CoSoVatChat {
	private double doRong;
	private double doDai;
	private int soChan;
	public double canNang() {
		return soChan*10 + doRong*doDai*10;
	}
	public Ban(String ma, iuh.fit.cs.chatLieu chatLieu, iuh.fit.cs.kichCo kichCo, int soChan, double doRong,
			double doDai, double canNang) {
		super(ma, chatLieu, kichCo, soChan);
		this.doRong = doRong;
		this.doDai = doDai;
		this.canNang();
	}
	public Ban(String ma, iuh.fit.cs.chatLieu chatLieu, iuh.fit.cs.kichCo kichCo, int soChan) {
		super(ma, chatLieu, kichCo, soChan);
	}
	
}
