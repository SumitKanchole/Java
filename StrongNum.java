import java.util.*;
class L3 {
	void displayNum(long num) {
	long fact=1;
	long sum=0;
	for(int i=1; i<=num;i++){
	fact= fact*i;
	}
	System.out.println(fact+" is factorial of "+num);
	long rem=0;
	while(fact!=0) {
	rem =fact%10;
	sum = sum+rem;
	fact =fact/10;
	}
	System.out.println(num+" : "+sum);
	if(sum==num)
	System.out.print("it is Strong Number");
	else
	System.out.print("it is not Strong Number");
	}
}
class StrongNum {
public static void main(String argsp[]) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter Number to check the number is Strong or not : ");
long num = sc.nextInt();

L3 obj = new L3();
obj.displayNum(num);

}
}