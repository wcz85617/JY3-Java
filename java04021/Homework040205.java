
public class Homework040205
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数字");
		int x = scanner.nextInt();
		int y = f(x);
		System.out.print("计算后结果:"+y);
	}
	public static int f(int ab)
	{
	
		int yy = ab++;
		return yy;
	
	}



}