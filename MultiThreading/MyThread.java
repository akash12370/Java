package MultiThreading;

public class MyThread {

	public static void main(String[] args) {
		NumberG t1 = new NumberG(1,100);
		NumberG t2 = new NumberG(0,100);
		
		t1.setName("Odd");
		t2.setName("Even");
		
		t1.start();
		t2.start();
		

	}

}
