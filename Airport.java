//Main Class named as Airport.java to maintain complete program
import java.util.*;
public class Airport {
public static Scanner ent = new Scanner(System.in);
static byte a,a1,a2;
static int j;
public static void main(String[] args) {
	ArrayList<Arrival>Arr=new ArrayList<Arrival>();
	ArrayList<Departure>Dpr=new ArrayList<Departure>();
	System.out.println("\n\t\tWelcome To Indira Gandhi Airpport\n\t\t     New Delhi, Delhi 110037");
	for(byte i=0;i<5;i++) {
		for(int k=0;k<3;k++) {
			j=(int)(Math.random()*10000);
			if(j<999)
				continue;
			else
				System.out.println("\n\nAuto Generated Password is "+j);
				break;		}
			System.out.print("Enter OTP to Validiate your Login session : ");
			int k=ent.nextInt();
		if(k==j) {
			System.out.println("\n\t\t !!!Access Granted!!!\n\t\tWelcome to IGI Airport");
		break;}
		else {
			System.out.println("\n\t\t!!!Wrong Pasword!!!\n\t\t     Do a retry");
			continue;}}
	for(byte i=0;i<50;i++) {
System.out.print("\t\tEnter Your Choice\n1.Arrival\t2.Departure\t3.Passenger\t4.Exit ");
byte a=ent.nextByte();
switch(a) {
case 1:
{
	System.out.println("\t\tWelcome to Arrival Section\n\t\t  I'm Here to assist you.");
	//arrival
	System.out.print("\t\tEnter Your Option\n1.Create Arrival\t2.View Arrivals ");
	a1=ent.nextByte();
	switch(a1) {
	case 1:
	{
	Arr.add(new Arrival());
}break;case 2:
{byte s1=1;
System.out.println("Serial no.\tPlane Name\tPID\t\tArrival Time\t\tSource\t\tDestination");
	for(Arrival a2:Arr) {
		System.out.println("    "+s1+"\t\t"+a2.Pname+"\t"+a2.Pid+"\t\t"+a2.arth+"\t\t\t"+a2.ars+"\t\tNew Delhi");
		s1++;
	}
}break;
	default:
	{
		System.out.println("!!!Make Your Right Decison!!!");
	}}}
break;
	case 2:
		{	System.out.println("\t\tWelcome to Departure Section\nt\t   I'm Here to assist you.");
		//Departure
		System.out.print("\t\tEnter Your Option\n1.Create Departure\t2.View Departure ");
		a1=ent.nextByte();
		switch(a1) {
		case 1:
		{
		Dpr.add(new Departure());
	}break;
	case 2:
	{byte s1=1;
	System.out.println("Serial no.\tPlane Name\tPID\tDeparture Time\t\tSource\t\tDestination");
		for(Departure a2:Dpr) {
			System.out.println("    "+s1+"\t\t"+a2.Pname+"\t"+a2.Pid+"\t\t"+a2.dpth+"\t\tNew Delhi\t"+a2.dsd);
			s1++;
		}}}}
		break;
	case 3:{
		//passengers
		System.out.println("\t\tWelcome to Passenger Section\n\t\tI'm Here to assist you.");
		System.out.print("\n\t\tEnter Your Option\n1.View Passenger List\t\t2.Search Any Passenger ");
		a2=ent.nextByte();
		switch(a2) {
		case 1:
		{Passenger.psnh();
		}break;
		case 2:{
			Passenger.psnf();
		}
	}}
	break;
	case 4:{
		System.exit(0);
	}break;
	default:
	{
		System.out.println("!!!Make Your Right Decison!!!");
	}
}
}}
}
