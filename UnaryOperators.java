
public class UnaryOperators 
{
	public static void main(String[] args) 
	{
		int a = 1;
		a++; //2
		System.out.println("2  " +a);
		a = a+1; //3
		System.out.println("3  " +a);
//		///////////////
		int b = 1;
		int y = b++;
		System.out.println(b+ " " +y);
		///////////////////////////////
		int c = 1;
		c++;
		c+=10;
		c/=2;
		//////////////////////////////////////
		int d = 10;
		double e = 2.2;
//		d = d/e;
		d/=e;
		
		System.out.print(c+ "c, " +d);
		
	}

}
