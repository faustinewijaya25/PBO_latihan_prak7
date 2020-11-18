class Bentuk {
	protected int p,l;}
	class persegi extends Bentuk {
		protected int p,l;
		public void setSuperP(int p) {
			super.p = p;}
			public void setSuperL(int l) {
				super.l = l;}
				public void setP(int p) {
					this.p = p;}
					public void setL(int l) {
						this.l = l;}
			public void getLuas() {
				System.out.println("Luas super:"+(super.l*super.p));
				System.out.println("Luas:"+(this.l*this.p)); }
				}
				class persegitest {
					public static void main(String [] args) {
						persegi kotak = new persegi();
						kotak.setSuperP(5);
						kotak.setSuperL(10);
						kotak.setP(3);
						kotak.setL(13);
						kotak.getLuas();
						}					
				}