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
	public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doRong,
			double doDai, double canNang) {
		super(ma, chatLieu, kichCo, soChan);
		setDoRong(doRong);
		setDoDai(doDai);
	}
	public double getDoRong() {
		return doRong;
	}
	public void setDoRong(double doRong) {
		if(doRong <= 0) {
			throw new IllegalArgumentException("Do rong > 0");
		}
		this.doRong = doRong;
	}
	public double getDoDai() {
		return doDai;
	}
	public void setDoDai(double doDai) {
		if(doDai <= 0) {
			throw new IllegalArgumentException("Do dai > 0");
		}
		this.doDai = doDai;
	}
	@Override
	public double canNang() {
		return getSoChan()*10 + doRong*doDai*10;
	}
	@Override
	public String toString() {
		return String.format("%-8s %-10s %-10s %8s %10s",getMa(),getChatLieu(),getKichCo(),getSoChan(),getDoRong(),getDoDai(),canNang());
	}
	
}

