import java.util.*;
class L4 {
	void displayTable(int num1, int num2) {
	for(int i=num1; i<=num2; i++) {
		for(int j=1; j<=10;j++) {
			System.out.println(i+" * "+j+" = " +(i*j));
		}
		System.out.println();
	}
	}
}
class Table2 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);

System.out.println("Start from : ");
int num1 = sc.nextInt();

System.out.println("End To : ");
int num2 = sc.nextInt();

L4 obj = new L4();
obj.displayTable(num1, num2);
}
}