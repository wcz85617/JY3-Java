import java.util.*;
public class Work0402
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ҫת��������/�ַ�:");
		//����charת��int����
		String num = scanner.next();
		//charAt ����ָ������������char���͵�ֵ
		char specialChar = num.charAt(0);
		int result = f(specialChar);
		System.out.print("ת������ַ�Ϊ:"+result);


		//����intת��char����
		//int num = scanner.nextInt();
		//char c = getIntToChar(num);
		//System.out.print("ת������ַ�Ϊ:"+c);
		//����
		//Math.sqrt();

	}
	//����intת��char����
	//public static char getIntToChar(int num)
	//{
		//return (char)num;
	//}
	public static int f(char c)
	{
		return c;
	
	}
	




}