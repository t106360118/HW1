package test_p9;

public class Sample12 {

	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 =5; 
		
		System.out.println("num1��num2�ĸ��N�\��:");
		System.out.println("num1+num2���"+(num1+num2));
		System.out.println("num1-num2���"+(num1-num2));
		System.out.println("num1*num2���"+(num1*num2));
		System.out.println("num1/num2���"+(num1/num2));
		System.out.println("num1%num2���"+(num1%num2));
		
		int a,b,c;
		a=b=c=0;
		b=a++;
		c=++a;
		
		System.out.println("�������ָ��ֵ֮����f��,����b��ֵ��"+b);
		System.out.println("��������f��֮���ָ��ֵ,����c��ֵ��"+c);
	}

}
