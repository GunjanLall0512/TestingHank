package javaPackage;

public class Decreasepatt1 {

	public void swap(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a " + a);
		System.out.println("b " + b);
		
	}
	public static void main(String[] args) {
		Decreasepatt1 dec=new Decreasepatt1();
		System.out.println("After Swap");
		dec.swap(5, 10);
		
		
		

	}

}
