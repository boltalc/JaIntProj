import java.util.Scanner;
public class BasicCalc{
    public static void main(String args[]){
	Scanner uInput = new Scanner(System.in);

	final String GREEN = "\u001B[32m";
	final String END = "\u001B[0m";
	final String BLUE = "\u001B[34m";
	final String RED = "\u001B[31m";
	System.out.println("Specify the operation you want to perform");
	System.out.printf("%sType 'A' to select addition%nType 'S' to select subtraction%nType 'M' to select multiplication%nType 'D' to select division%s%n",BLUE,END);
	System.out.println();
	char ope = uInput.next().charAt(0);
	System.out.println();
	String message = "You have selected ";
	String midi = " operation, now enter the two digits you want to calculate one after the other";
	if(ope == 'D' || ope == 'd'){
	    System.out.printf("%s%sdivision%s%s%n",GREEN,message, midi,END);
	    System.out.println();
	    double num = Arith.divi(uInput.nextFloat(),uInput.nextFloat());
	    System.out.println();
	    num = Math.round(num * 100.0) / 100.0;
	    System.out.println(BLUE + num + END);
	}
	else if(ope == 'A' || ope == 'a'){
	    System.out.println(GREEN + message + "addition" + midi + END);
	    System.out.println();
	    double num = Arith.add(uInput.nextFloat(),uInput.nextFloat());
	    System.out.println();
	    num = Math.round(num * 100.0) / 100.0;
	    System.out.println(BLUE + num + END);
	}
	else if(ope == 'S' || ope == 's'){
	    System.out.println(GREEN + message + "subtraction" + midi + END);
	    System.out.println();
	    double num = Arith.sub(uInput.nextFloat(),uInput.nextFloat());
	    System.out.println();
	    num = Math.round(num * 100.0) / 100.0;
	    System.out.println(BLUE + num + END);
	}
	else if(ope == 'M' || ope == 'm'){
	    System.out.println(GREEN + message + "multiplication" + midi + END);
	    System.out.println();
	    double num = Arith.multi(uInput.nextFloat(),uInput.nextFloat());
	    System.out.println();
	    num = Math.round(num * 100.0) / 100.0;
	    System.out.println(BLUE + num + END);
	}
	else{
	    System.out.println(RED + "You selected an invalid operation" + END);
	}
    }
}

class Arith{
    public static double add(double a, double b){
	return a + b;
    }

    public static double sub(double a, double b){
	return a - b;
    }

    public static double multi(double a, double b){
	return a * b;
    }

    public static double divi(double a, double b){
	if(a == 0 || b == 0)
	    return 0;
	else
	    return a / b;
    }
}
