import java.util.Scanner;


public class WithMath {
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		int x,y,z;
		System.out.println("Please enter a number for x");
		System.out.println("Please enter a number for y");
		System.out.println("Please enter a number for z");
		x=keyboard.nextInt();
		y=keyboard.nextInt();
		z=keyboard.nextInt();
		//h(x)=x^10
		System.out.println(Math.pow(x,10));
		//f(x+y)
		System.out.println(x+y);
		//g(x)=sqrt(x)+abs(y)+(z+y)
		System.out.println(Math.sqrt(x)+Math.abs(y)+ Math.pow(z,y));
	}

}