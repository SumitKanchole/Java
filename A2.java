import java.util.*;
class Scoreboard {
private long over,run,ball;
private String batsman, bowler, nonstriker;
Scanner sc = new Scanner(System.in);
void SetOver(long over){
	this.over=over;
}
long getOver() {
	return over;
}

void SetRun(long over){
	this.run=run;
}
long getRun() {
	return run;
}

void SetBall(long over){
	this.ball=ball;
}
long getBall() {
	return ball;
}

void SetBatsman(String batsman){
	this.batsman=batsman;
}
String getBatsman() {
	return batsman;
}

void SetBowler(String bowler){
	this.bowler=bowler;
}
String getBowler() {
	return bowler;
}

void SetNonstriker(String nonstriker){
	this.nonstriker=nonstriker;
}
String getNonstriker() {
	return nonstriker;
}
Scoreboard() {
this.over=over;
this.run=run;
this.ball=ball;
this.batsman=batsman;
this.bowler=bowler;
this.nonstriker=nonstriker;

}
}
class A2 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	long over = sc.nextLong();
	long run = sc.nextLong();
	long ball = sc.nextLong();
	sc.nextLine();
	String batsman = sc.nextLine();
	String bowler = sc.nextLine();
	String nonstriker = sc.nextLine();
	Scoreboard sb = new Scoreboard();
	sb.SetOver(over);
	sb.SetRun(run);
	sb.SetBall(ball);
	sb.SetBatsman(batsman);
	sb.SetBowler(bowler);
	sb.SetNonstriker(nonstriker);

	System.out.println(sb.getOver());
	System.out.println(sb.getRun());
	System.out.println(sb.getBall());
	System.out.println(sb.getBatsman());
	System.out.println(sb.getBowler());
	System.out.println(sb.getNonstriker());
	
	

}
}