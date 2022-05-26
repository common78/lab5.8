package First1;

import java.util.Scanner;

public class First1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("do not enter an integer: ");
        float n = scan.nextFloat();

        if (n >= 50 && n <= 100){
            System.out.println("Number " + n + " contained in the interval(50; 100)");
        }else {
            System.out.println("Number " + n + " do not contained in the interval(50; 100)");}

        }

}
