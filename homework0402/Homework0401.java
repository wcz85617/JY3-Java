import java.util.*;
public class Homework0401
{
	public static void main(String[] args)
	{
		int age1 = 34;
		int age2 = 24;
		System.out.println(age1+age2);
		int num21 = 50;
		String num2 = Integer.toBinaryString(num21);
		System.out.println(num2);
		int num31 = 50;
		String num3 = Integer.toOctalString(num31);
		System.out.println(num3);
		int num41 = 50;
		String num4 = Integer.toHexString(num41);
		System.out.println(num4);
		long g=12345678901l;
		float t=3.1415926f;
		double d=1234567890.0987654321;
		Random r = new Random();
		int rInt = r.nextInt(26);
		System.out.println(rInt);
		char c =(char)('A'+rInt);
		System.out.println(c);
		//97������ַ���a��
		//�ַ�0�����������48;
		//���ռ�������
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ������");
		int num = scanner.nextInt();
		System.out.println("�������ֵ��"+num);
		//���� ϲȵ ǧ�������
		//1����=946080000000*4.2
		//0.45m=0.00045km
		double bird = 0.00045;
		double ly = 946080000000.0*4.2;
		System.out.println(ly/bird);
		//С������ٶ�,�п����Ĵ����д
		double x = 2*9.8*384;
		System.out.print(Math.sqrt(x));
	}


}