package Fourth;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner options = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String y = options.nextLine();
        String op1 = "Agree";
        switch (op1){
            case "Agree":
                switch (y){
                    case "Yes":
                        System.out.print("I agree!");
                        break;
                    case "OК":
                        System.out.print("I agree!");
                        break;
                    case "Так":
                        System.out.print("I agree!");
                        break;
                    case "Y":
                        System.out.print("I agree!");
                        break;
                    case "+":
                        System.out.print("I agree!");
                        break;
                    case "Ok":
                        System.out.print("I agree!");
                        break;
                }
            case "disagree":
                switch(y){
                    case "Ні":
                        System.out.print("I disagree!");
                        break;
                    case "NO":
                        System.out.print("I disagree!");
                        break;
                    case "N":
                        System.out.print("I disagree!");
                        break;
                    case "-":
                        System.out.print("I disagree!");
                        break;
                    case "No":
                        System.out.print("I disagree!");
                        break;
                    default:
                        System.out.print("You have entered an incorrect value!");
                }
                }

	}

}
