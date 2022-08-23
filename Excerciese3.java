
public class Excerciese3 
{
	public static void main(String[] args) 
	{
		Integer number = 32;
//		binary number format
		String convert = Integer.toBinaryString(number);
		System.out.println(convert +" ");
//		Octagonal number format
		convert = Integer.toOctalString(number);
		System.out.println(convert + " ");
//		Hexidecimal number format
		convert = Integer.toHexString(number);
		System.out.println(convert +". ");
	}

}
