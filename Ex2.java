
public class Ex2 
{
	public static void main (String [] args)
	{
		long a =2147483647000L;
		int b = 1;
		b+=a;
		Object ab = (Object) b;
		System.out.println(ab.getClass().getName() + " value: " +ab);
	}

}
