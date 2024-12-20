import java.util.*;
class digit2 {

void digitCount(int num) {
	
	int even=0,odd=0;
	while(num!=0) {
		num = num/10;
		if((num%10)%2==0)
		even++;
		else
		odd++;
	}
	System.out.println("length of even number : "+even);
	System.out.println("length of odd number : "+odd);

}
}
class F2 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter numbers : ");
int num = sc.nextInt();

digit2 obj = new digit2();
obj.digitCount(num);
}

}
