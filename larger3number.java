package guviset3;
import java.util.Scanner;
public class larger3number {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if(a>c||a>d){
			System.out.println("The Larger number is a");
			}
		if(c>a||c>d){
			System.out.println("The larger value is c");
		}
		if(d>a||d>c){
			System.out.println("The larger number is d");
		}

	}

}
