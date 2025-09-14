/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 2:56:56 AM
 */
package iuh.fit.cs;

class Ghe extends CoSoVatChat {
	private boolean coTuGhe;
	private int soChan;
	public double nangNangCuaTuaGhe () {
		return coTuGhe ? 20 : 0;
	}
	public double canNang () {
		return soChan*10 + nangNangCuaTuaGhe();
	}
	public Ghe(String ma, iuh.fit.cs.chatLieu chatLieu, iuh.fit.cs.kichCo kichCo, int soChan, boolean coTuGhe) {
		super(ma, chatLieu, kichCo, soChan);
		this.coTuGhe = coTuGhe;
		this.soChan = soChan;
	}
	public Ghe(String ma, iuh.fit.cs.chatLieu chatLieu, iuh.fit.cs.kichCo kichCo, int soChan) {
		super(ma, chatLieu, kichCo, soChan);
	}
	
	
}
