//A another class named as Departure.java to maintain all departure records
public class Departure {
	static byte a2;
	String dpth;
	String Pname,dsd,Pid;
	public Departure() {
		System.out.print("\t\tSelect any Plane\n1.Spice Jet\t2.Airbus\t3.IndianAir ");
		a2=Airport.ent.nextByte();
		switch(a2)
		{
		case 1:{
			Pname="Spice Jet ";
			System.out.print("Enter Plane ID ");
			Pid=Airport.ent.next();
			time();
			System.out.print("Enter Destination Station ");
			dsd=Airport.ent.next();}
		break;
		case 2:{
			//Airbus
			Pname="Airbus    ";
			System.out.print("Enter Plane ID ");
			Pid=Airport.ent.next();
			time();
			System.out.print("Enter Destination Station ");
			dsd=Airport.ent.next();}
		break;
		case 3:{
			//IndianAir
			Pname="Indian Air";
			System.out.print("Enter Plane ID ");
			Pid=Airport.ent.next();
			time();
			System.out.print("Enter Destination Station ");
			dsd=Airport.ent.next();}		
		break;
		default:
		{
			System.out.println("Make your Right Decison ");
		}}}
	void time(){
		System.out.print("Enter The Time HH:MM ");
		dpth=Airport.ent.next();
	}	}