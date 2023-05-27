import java.util.Scanner;

public class Booleanz{
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;
		
		System.out.println("Gimme two numbers.");
		x = input.nextDouble();
		y = input.nextDouble();
		
		a=x<y;
		b=x<=y;
		c=x==y;
		d=x!=y;
		e=x>y;
		f=x>=y;
		
		System.out.println(a+", "+b+", "+c+", "+d+", "+e+", "+f);
	}
}