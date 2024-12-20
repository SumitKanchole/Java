import java.util.*;
class digits {

void digitCount(int num) {
	
	int count=0;
	while(num!=0) {
		num = num/10;
		count++;
	}
	System.out.println("length of number : "+count);

}
}
class F1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter numbers : ");
int num = sc.nextInt();

digits obj = new digits();
obj.digitCount(num);
}

}
