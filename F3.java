import java.util.*;
class digit3 {

void digitCount(int num) {
	
	int sum=0,count=0,rem=0;
	int x=num;
	while(num!=0) {
		
		int r = num/10;
		sum+=r;
		count++;
		}
	int ct = count;
	if(ct==2){
	while(num>0){
	rem = num%10;
          sum+=(rem*rem);
          num=num/10;
          }
	System.out.println(sum);
		}
	else if(ct==3){
	while(num>0){
	rem = num%10;
          sum+=(rem*rem*rem);
          num=num/10;
          }
	System.out.println(sum);
	}
	else if(ct==4){
	while(num>0){
	rem = num%10;
          sum+=(rem*rem*rem*rem);
          num=num/10;
          }
	System.out.println(sum);
	}
	else {
	System.out.println("Number greater than 4 ");
	}

}
}
class F3 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter numbers : ");
int num = sc.nextInt();

digit3 obj = new digit3();
obj.digitCount(num);
}

}
