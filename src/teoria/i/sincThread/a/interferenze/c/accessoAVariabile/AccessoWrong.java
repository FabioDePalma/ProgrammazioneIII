package teoria.i.sincThread.a.interferenze.c.accessoAVariabile;

public class AccessoWrong {
	public static void main(String[] args) {
		C c = new C();
		T t1 = new T(1, c);
		T t2 = new T(2, c);
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch(InterruptedException e1) {System.out.println(e1.getMessage());}
		try {
			t2.join();
		} catch(InterruptedException e1) {System.out.println(e1.getMessage());}
		System.out.println("Main: c.i= " + c.i);
	}
}