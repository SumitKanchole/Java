import java.util.*;
class Power{
	void getNum(int num) {
		int count=0,add=0,sum=0;
		int x=num;
		while(num!=0) {
		num = num/10;
		add+=num;
		count++;
		}

		int temp = count;

		if(temp==2){
		while(x!=0) {
		int y = x%10;
		sum = sum+(y*y);
		x = x/10;
		}
		System.out.println("Sum of number is : "+sum);
		}

		else if(temp==3){
		while(x!=0) {
		int y = x%10;
		sum = sum+(y*y*y);
		x = x/10;
		}
		System.out.println("Sum of number is : "+sum);
		}

		else if(temp==4){
		while(x!=0) {
		int y = x%10;
		sum = sum+(y*y*y*y);
		x = x/10;
		}
		System.out.println("Sum of number is : "+sum);
		}

		else {
		System.out.println("your power above the 4 ");
		}
}
}
class F3 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number : ");
int num =sc.nextInt();

Power p1 = new Power();
p1.getNum(num);

}
}
