import java.util.*;
public class Homework0402031
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ������");
		int x = scanner.nextInt();
		int y = f(x);
		System.out.print("�������:"+y);
	}
	public static int f(int ab)
	{
	
		int yy = ab%3;
		return yy;
	
	}

}
