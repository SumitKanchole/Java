import java.util.*;
class Palindrome {
void getCheckNum(int num) {
	int sum=0;
	int rem=0;
	int temp=num;

	while(num!=0) {
	rem = num%10;
	sum = sum*10+rem;
	System.out.println(num);
	num = num/10;
	
	}
	if(sum==temp) {
	System.out.println("it's a palindrome number!!!! ");
	}
	else {
	System.out.println("it's not palindrome number!!!! ");
	}
}
}
class F4 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number to check its palindrome or not : ");
int num = sc.nextInt();

Palindrome p1 = new Palindrome();
p1.getCheckNum(num);
}
}

/*Example:1
Enter a number to check its palindrome or not : 1235754321
1235754321
123575432
12357543
1235754
123575
12357
1235
123
12
1
it's not palindrome number!!!!

Example:2
Enter a number to check its palindrome or not : 123454321
123454321
12345432
1234543
123454
12345
1234
123
12
1
it's a palindrome number!!!!
*/