package app_java_2;

public class A {
       public void test() {
    	   System.out.println(100);
       }
  
}

public class B extends A{
	public void test() {
		System.out.println(500);
	}
	public static void main(String[] args) {
	B b1= new B();
	b1.test();
}