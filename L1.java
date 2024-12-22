import java.util.*;
class A {
	void display1() {
	System.out.println("Hello A");
}}
class B extends A {
	void display2() {
	System.out.println("Hello B");
}}
class C extends A {
	void display3() {
	System.out.println("Hello C");
}}
class D extends B {
	void display4() {
	System.out.println("Hello D");
}
}
class E extends B {
	void display5() {
	System.out.println("Hello E");
}}
class F extends C {
	void display6() {
	System.out.println("Hello F");
}
}
class G extends C {
	void display7() {
	System.out.println("Hello G");
}

}

class L1 {
public static void main(String args[]) {

D obj = new D();
obj.display1();
obj.display2();
obj.display4();
System.out.print("\n-----------------\n");

E obj1 = new E();
obj1.display1();
obj1.display2();
obj1.display5();
System.out.print("\n-----------------\n");

F obj2 = new F();
obj2.display1();
obj2.display3();
obj2.display6();
System.out.print("\n-----------------\n");

G obj3 = new G();
obj3.display1();
obj3.display3();
obj3.display7();
}
}

/* output  :-

Hello A
Hello B
Hello D

-----------------
Hello A
Hello B
Hello E

-----------------
Hello A
Hello C
Hello F

-----------------
Hello A
Hello C
Hello G
*/