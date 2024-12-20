import java.util.*;
class product {
private int pid;
private String pname;
private String ptype;
private double price;

product(int pid, String pname, String ptype, double price) {
this.pid=pid;
this.pname=pname;
this.ptype=ptype;
this.price=price;
}
void display() {
	
	System.out.println("\n-----------------------\n");
	
	System.out.println("your product ID : "+pid);
	System.out.println("your product Name : "+pname);
	System.out.println("your product Type : "+ptype);
	System.out.println("your product price : "+price);
	
}
}
class product1 {
public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the size of object : ");
	int size = Integer.parseInt(sc.nextLine());
	
	product a[]=new product[size];
	
	for(int i=0; i<a.length;i++){
	System.out.println("\n\n");
	System.out.println("Enter product Id : ");
	int pid = Integer.parseInt(sc.nextLine());
	System.out.println("Enter product Name : ");
	String pname = sc.nextLine();
	System.out.println("Enter product type : ");
	String ptype = sc.nextLine();
	System.out.println("Enter product price : ");
	double price = Double.parseDouble(sc.nextLine());
	
	a[i] =new product(pid,pname,ptype,price);
	}
	
	for(product p:a) {
		p.display();
	

	}
}
}
