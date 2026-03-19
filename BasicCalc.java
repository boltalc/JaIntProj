public class BasicCalc{
    public static void main(String args[]){
	arith calc = new arith();
	int i = calc.add(12, 3);
	int j = calc.sub(12, 3);
	int k = calc.multi(12, 3);
	double l = calc.divi(12, 3);
	    System.out.printf("%d %n%d %n%d %n%.0f %n", i,j,k,l);
    }
}

class arith{
    public int add(int a, int b){
	return a + b;
    }

    public int sub(int a, int b){
	return a - b;
    }

    public int multi(int a, int b){
	return a * b;
    }

    public double divi(int a, int b){
	if(a == 0 || b == 0)
	    return 0;
	else
	    return a / b;
    }
}
