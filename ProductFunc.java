package guru;

public class ProductFunc {
public static void main(String[] args) {
	int a=5;
	int b=9;
	int result=multiply(a,b);
	System.out.println("a*b="+result);
}
public static int multiply(int a,int b) {
	int prod=a*b;
	return prod;
}
}
