import java.util.*;
class A {
	void display1() {
	System.out.println("one");
}
}
class B extends A {
	void display2() {
	System.out.println("two");
}
}
class C extends B {
	void display3() {
	System.out.println("three");
}
}
class D extends B {
	void display4() {
	System.out.println("four");
}
}
class E extends C {
	void display5() {
	System.out.println("five");
}
}
class G extends E {
	void display6() {
	System.out.println("six");
}
}
class H extends E {
	void display7() {
	System.out.println("seven");
}
}
class F extends D {
	void display8() {
	System.out.println("Eight");
}
}
class I extends F {
	void display9() {
	System.out.println("Nine");
}
}
class J extends F {
	void display10() {
	System.out.println("Ten");
}
}

class L2 {
public static void main(String args[]) {
G q1 =new G();
q1.display1();
q1.display2();
q1.display3();
q1.display5();
q1.display6();
}
}
