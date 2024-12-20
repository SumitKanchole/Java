class BankAccount {
private String Account_Number;
private String Accountholder_Name;
private double balance;

BankAccount() {
Account_Number="4736734348";
Accountholder_Name="Sumit kanchole";
balance= 34625;
}
BankAccount(String Account_Number,String Accountholder_Name,double balance) {
this.Account_Number=Account_Number;
this.Accountholder_Name=Accountholder_Name;
this.balance=balance;
}
BankAccount(BankAccount copy) {
Account_Number=copy.Account_Number;
Accountholder_Name=copy.Accountholder_Name;
balance=copy.balance;

}

void display() {
System.out.println("\n-----------------------------\n");
System.out.println("your Account Number : "+Account_Number);
System.out.println("your Account holder Name : "+Accountholder_Name);
System.out.println("your Account balance : "+balance);
}
}

class A15 {
public static void main(String args[]) {
BankAccount obj = new BankAccount();
BankAccount obj1 = new BankAccount("23321745234","pankaj rathod",3754.234);
BankAccount obj2 = new BankAccount(obj1);
BankAccount obj3 = new BankAccount("23321745234","pankaj rathod",11754.234);

obj.display();
obj1.display();
obj2.display();
obj3.display();
}
}
