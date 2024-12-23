class A {
A() {
this(12);
System.out.println("A is default");
}
A(int a) {
System.out.println("A is single para");
}
A(int a,int b) {
System.out.println("A is double para");
}

}
class B extends A {
B() {
super(2,3);
System.out.println("B is default");
}
B(int a) {
this(10,20);
System.out.println("B is single para");
}
B(int a, int b) {
super(10);
System.out.println("B is double para");
}
}

class Y {
public static void main(String args[]) {
B obj =new B();
B obj1 =new B(10);
B obj2 =new B(10,20);

}
}
