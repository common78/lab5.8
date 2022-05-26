package Second2;

import java.util.Scanner;

public class Second2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int n = scan.nextInt();
        int a = n%10;
        int b = n/10;
        int c = b%10;
        int d = b/10;
        if(a > c && a > d){
            System.out.println("The largest number :" + a);
        }else if(c > a && c > d){
            System.out.println("The largest number :" + c);
        }else{
            System.out.println("The largest number :" + d);
        }

	}

}
