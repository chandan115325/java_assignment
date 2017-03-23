//Write a program to print the result of the following expressions provided the integer variable a is 20 and b is 10.


public class OperatorsWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10,c=0,d=0,e=0;
		 b= a-- - --a;
		 c=a--;
		 d=a>>2;
		 e=a&b;
		 
		 System.out.println("b = a-- - --a" + " is" + " " +b);
		 System.out.println("c= a--" + " is" + " " +c);
		 System.out.println("d=a>>2" + " is" + " " +d);
		 System.out.println("e = a & b" + " is" + " " +e);

	}

}
