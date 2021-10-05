public class calculator {
	public static void main(String[] args) {
		int i=0;
                int a=Integer.parseInt(args[0]);
                int b=Integer.parseInt(args[1]);

		int mul=a*b;
		int div=a/b;
		System.out.println(" the product of two numbers is : "+mul);
		System.out.println("the quotient of two numbers is : "+ div);
	}
}