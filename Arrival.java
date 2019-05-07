// Another Class named as Arrival.java to maintain all arrival records
public class Arrival {
	static byte a2; String arth,artm;
	String Pname,Pid,ars;
	public Arrival() {
		System.out.print("\t\tSelect any Plane\n1.Spice Jet\t2.Airbus\t3.IndianAir  ");
		a2=Airport.ent.nextByte();
		switch(a2)
		{
		case 1:{
			Pname="Spice Jet ";
			System.out.print("Enter Plane ID ");
			Pid=Airport.ent.next();
			time();
			System.out.print("Enter Source Station  ");
			ars=Airport.ent.next();}
		break;
		case 2:{
			//Airbus
			Pname="Air Bus   ";
			System.out.print("Enter Plane ID ");
			Pid=Airport.ent.next();
			time();
			System.out.print("Enter Source Station ");
			ars=Airport.ent.next();}
		break;
		case 3:{
			//IndianAir
			Pname="Indian Air";
			System.out.print("Enter Plane ID ");
			Pid=Airport.ent.next();
			time();
			System.out.print("Enter Source Station ");
			ars=Airport.ent.next();}		
		break;
		default:
		{
			System.out.println("!!!Make your Right Decison!!!");
		}}
	}void time(){
		System.out.print("Enter The Time HH:MM  ");
		arth=Airport.ent.next();
	}
	}