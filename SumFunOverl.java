package guru;

public class SumFunOverl {
public static void main(String[] args) {
	System.out.println(sum(3,5));
	System.out.println(sum(4,6,7));
}
public static int sum(int a,int b) {
	return a+b;
}
public static int sum(int a,int b,int c) {
	return a+b+c;
}
}
