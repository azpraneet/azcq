package thread;

public class A extends Thread {
	String name;
	A(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("shweta");
			
		}
	}
	public static void main(String[] args) {
		A a1 = new A(name);
		a1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("azam");
			
		}
	}
}
