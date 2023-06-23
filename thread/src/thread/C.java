package thread;

public class C extends Thread {
	String name;
	A(String name){
		this.name=name;
		
	}
	public static void main(String[] args) {
		A a1 = new A ("xx");
		A a2 = new A ("yy");
		a1.setPriority(1);
		a2.setPriority(10);
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		a1.start();
		a2.start();
		
	}

}