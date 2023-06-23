package p1; //overriding

public class PlatiniumAccoun extends GoldAccount {

	@Override
	public void chBook() {
				System.out.println("unlimited");
	}

	@Override
	public void intrestRate() {
		        System.out.println("6%");
			}
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.onlineBanking();
		g.chBook();
		g.intrestRate();
		PlatiniumAccoun p = new PlatiniumAccoun();
		p.onlineBanking();
		p.chBook();
		p.intrestRate();
	}
	
}
