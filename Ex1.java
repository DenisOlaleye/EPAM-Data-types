
public class Ex1 
{
	public static void main(String[] args) 
	{
		int a = 129;
		byte b = 3;
		Object ab = (byte) a + b;
		System.out.println(ab.getClass().getName() + " value: " + ab);
		
	}
}
