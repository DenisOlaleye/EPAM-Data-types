
public class Ex4 
{
	public static void main(String[] args) 
	{
		double a;
		double b;
		double c;
		double d;
		double sum;
		double sumBC;
		double comAB;
		
		a = -3.0/0;
		b = 3.0/0;
		c = 0/4.0;
		d = 0/0.0;
		sum = a+b+c+d;
		sumBC = b+c;
		comAB = a*b;
		
		System.out.println(sum + " " +sumBC+ " " +comAB);
		
		
	}

}
