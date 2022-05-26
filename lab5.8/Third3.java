package Third3;

import java.util.Scanner;

public class Third3 {

	public static void main(String[] args) {
		Scanner floor = new Scanner(System.in);
        System.out.print("Enter the current floor: ");
        int f1 = floor.nextInt();
        System.out.print("Enter the desired floor: ");
        int f2 = floor.nextInt();
        if(f1 >= 1 && f1 <= 9 && f1 < f2  && f2 <= 9 && f2 != 2){
            System.out.print("You climbed on " + f2 + " floor");
        }else if(f1 >= 1 && f1 <= 9 && f1 > f2 && f2 <= 9 && f2 !=2){
            System.out.print("You went down on " + f2 + " floor");
        }else if(f1 >=1 && f1 <= 9 && f1 < f2 && f2 == 2 && f2 <= 9){
            System.out.print("You went up to the 3rd floor");
        }else if(f1 >=1 && f1 <= 9 && f1 > f2 && f2 == 2 && f2 <=9){
            System.out.print("You went up to the 1rd floor");
        }else{
            System.out.print("You have specified a non-existent floor");
        }

	}

}
