import java.util.*;
class Scoreboard {
private long over,run,ball;
private String batsman, bowler, nonstriker;
Scanner sc = new Scanner(System.in);
/*
long getOver() {
	return over;
}

long getRun() {
	return run;
}

long getBall() {
	return ball;
}

String getBatsman() {
	return batsman;
}

String getBowler() {
	return bowler;
}

String getNonstriker() {
	return nonstriker;
}
*/
Scoreboard(String batsman,String bowler,String nonstriker,long over,long ball,long run) {
this.over=over;
this.run=run;
this.ball=ball;
this.batsman=batsman;
this.bowler=bowler;
this.nonstriker=nonstriker;

}
void display() {
System.out.println("\n------------------------\n");

System.out.println("Batsman : "+batsman);

System.out.println("Bowler : "+bowler);

System.out.println("Non-Striker : "+nonstriker);

System.out.println("Over : "+over);

System.out.println("Ball : "+ball);

System.out.println("Run : "+run);
}
}
class Cricket {
public static void main(String args[]) {
	
	Cricket cr = new Cricket();
	Scanner sc = new Scanner(System.in);
	long over = sc.nextLong();
	long run = sc.nextLong();
	long ball = sc.nextLong();
	sc.nextLine();
	String batsman = sc.nextLine();
	String bowler = sc.nextLine();
	String nonstriker = sc.nextLine();
	

	Scoreboard sb = new Scoreboard(batsman,bowler,nonstriker,over,ball,run);
	Scoreboard sb1 = new Scoreboard(batsman,bowler,nonstriker,over,ball,run);
	Scoreboard sb2 = new Scoreboard(batsman,bowler,nonstriker,over,ball,run);

	
	sb.display();
	sb1.display();
	sb2.display();

}
}