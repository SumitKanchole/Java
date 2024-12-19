import java.util.*;
class Delivery
{
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	Scanner sc = new Scanner(System.in);
	
	
	Delivery()
	{
		this.over = 00;
		this.ball = 00;
		this.runs = 00;
		this.batsman = "Striker";
		this.bowler = "Bowler";
		this.nonStriker = "Non-Striker";
	}
	
	Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker)
	{
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	
	public void setter(long over,long ball,long runs,String batsman,String bowler,String nonStriker)
	{
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	
	public void getter()
	{
		System.out.println();
		System.out.println("Over : "+over);
		System.out.println("Ball : "+ball);
		System.out.println("Runs : "+runs);
		System.out.println("Batsman     : "+batsman);
		System.out.println("Bowler      : "+bowler);
		System.out.println("Non-Striker : "+nonStriker);
		System.out.println();
	}	
}

class Cricket
{
	public static void main(String args[])
	{
		Delivery obj1 = new Delivery();
		obj1.getter();
		Delivery obj2 = new Delivery(3,5,52,"Fayyaz","Sumit","Anant");
		obj2.getter();
		Delivery obj3 = new Delivery();
		obj3.setter(3,5,40,"Manish","Deshaj","Devansh");
		obj3.getter();
	}
}
