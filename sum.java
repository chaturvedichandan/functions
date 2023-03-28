package guru;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	int ans=sum2();
	System.out.println(ans);
}
static int sum2() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no 1");
	int num1=sc.nextInt();
	System.out.println("enter no 2");
	int num2=sc.nextInt();
	int sum=num1+num2;
    return sum; 
}
static void sum() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no 1");
	int num1=sc.nextInt();
	System.out.println("enter no 2");
	int num2=sc.nextInt();
	int sum=num1+num2;
	System.out.println("the sum="+sum);
}
}
