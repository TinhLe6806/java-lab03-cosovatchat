/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  lecao
 * @version: 1.0
 * @created: Sep 4, 2025 2:56:56 AM
 */
package iuh.fit.cs;

class Ghe extends CoSoVatChat {
		private boolean coTuaGhe;
		
		public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
			super(ma, chatLieu, kichCo, soChan);
			setCoTuaGhe(coTuaGhe);;
		}
		public boolean isCoTuaGhe() {
			return coTuaGhe;
		}
		public void setCoTuaGhe(boolean coTuaGhe) {
			this.coTuaGhe = coTuaGhe;
		}
		@Override
		public double canNang() {
			int nangNangCuaTuaGhe = coTuaGhe ? 20 : 0;
			return getSoChan() * 10 + nangNangCuaTuaGhe;
 		}
		
		
		@Override
		public String toString() {
		return String.format("%-8s %-10s %-10s %8s %-12s %10s",getMa(),getChatLieu(),getKichCo(),getSoChan(),coTuaGhe ? "Có" : "Không",canNang());
		}
}
