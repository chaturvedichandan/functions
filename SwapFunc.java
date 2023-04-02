package guru;

public class SwapFunc {
public static void main(String[] args) {
swap(5,10);
}
public static void swap(int a,int b) {
	 
	int temp=a;
	a=b;
	b=temp;
	System.out.println("a is "+a);
	System.out.println("b is "+b);	
}

}
