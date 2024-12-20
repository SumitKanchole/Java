//prduct details
import java.util.*;
class product {
private int pid;
private String pname,ptype;
private double price;

product() {
Scanner sc = new Scanner(System.in);
System.out.print("enter id : ");
pid = Integer.parseInt(sc.nextLine());
System.out.print("enter product name : ");
pname = sc.nextLine();
System.out.print("enter product type : ");
ptype = sc.nextLine();
System.out.print("enter price : ");
price = sc.nextDouble();
}

void display() {
System.out.println("product Id : "+pid);
System.out.println("product name : "+pname);
System.out.println("product type : "+ptype);
System.out.println("product price : "+price);
}
}
class demo515 {
public static void main(String args[]) {

product obj1 = new product();

obj1.display();

}
}
