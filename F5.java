//pending work!!!

import java.util.*;
class CircleR {
	int circleCircum(int m) {
	int a=  2*3.14*m;
	return a;
	}
	double circleCircum(double n) {
	return 2*3.14*n;
	}
	int circleArea(int m) {
	return 3.14*m*m;
	}

	double circleArea(double n) {
	return 3.14*n*n;
	} 
}
class F5 {
public static void main(String args[]) {
Scanner sc =new Scanner(System.in);
System.out.println("enter radius of circle (in Integer) : ");
int m = sc.nextInt();

System.out.println("enter radius of circle (in decimal) : ");
double n = sc.nextDouble();

CircleR cr =new CircleR();
cr.circleCircum(m);
System.out.println("Circumstance of circle in Integer : "+cr.circleCircum(m));
cr.circleCircum(n);
System.out.println("Circumstance of circle in double : "+cr.circleCircum(n));
cr.circleArea(m);
System.out.println("Area of circle in Integer : "+cr.circleArea(m));
cr.circleArea(n);
System.out.println("Area of circle in double : "+cr.circleArea(n));

}
}