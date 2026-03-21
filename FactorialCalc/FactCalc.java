import java.util.Scanner;
public class FactCalc{
    public static void main(String args[]){
	System.out.println("Enter a number");
	Scanner inPut = new Scanner(System.in);
	int outPut = factorial(inPut.nextInt());
	System.out.println(outPut);
    }

    public static int factorial(int i){
	if(i == 0 || i < 0){
	    return 1;
	}
	else{
	    return i * factorial(i - 1);
	}
    }
}
