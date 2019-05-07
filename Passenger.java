//Class named as Passesnger.java to maintain all records of Passenger
public class Passenger {
	static int k,j;
	static String name;
	static String [] psngr= {"Aman","Ravi","Tanya","Ramesh","Mukesh","Suresh","John","Amit","Ronit","Mohit","Nikesh","Vikash","Rakesh","Keshav","Vishnu","Manonit","Ankush","Vinay","Rohit","Manoj","Manish","Aadarsh","Mahesh","Neelu","Aashita","Aashima","Naveen","Zoya","Bhavishya","Bhavya","Reshma","Vimal","Vimra","Aaditya","Anmol","Neetu","Neelam","Arpita","Julee","Rahul","Sudhakar","Vishal","Vaibhav","Vimal","Yatin","Jatin","Yaman","Reshmi","Mohini","krishna","Shivam","Subham","Nilu"};
	static String [] srnm= {" Kumar","Bajpai"," Mehta"," Lokhande"," Mishra"," Mehta"," Chaudhary"," Singh"," Gumber"," Chaturvedi"," Shastri"," Jangra"," Gupta"," Thakur"};
	static String [] Name=new String[100];
	static String [] pid= {"SPJ971","SPJ162","ARB821","ARB191","AIR919","AIR289","SPJ281","ARB691","AIR762","AIR688"};
	static String [] pnam= {"Spice Jet","Air Bus","Indian Air"};
	static String [] dest= {"New Delhi","Jaipur","Dehradun","Loshkeen","Patna","Bikaner","Kolkata","Chandigrah","Chattisgrah","Mumbai","Pune","Nepal","Lacknow"};
	static String [] src= {"New Delhi","Jaipur","Dehradun","Loshkeen","Patna","Bikaner","Kolkata","Chandigrah","Chattisgrah","Mumbai","Pune","Nepal","Lacknow"};
	static void psnh() { System.out.println("Names are :-");
	for(int i=0;i<100;i++) {
		j=(int)(Math.random()*50);			k=(int)(Math.random()*13);
		Name[i]=psngr[j]+srnm[k];
		System.out.println(Name[i]);
	}}
	static void psnf() {
		System.out.print("Enter the name to be searched ");
		name=Airport.ent.next();
		for(int i=0;i<50;i++) {
			if(name.equalsIgnoreCase(psngr[i])) {
				k=(int)(Math.random()*13);int a=(int)(Math.random()*2);int b=(int)(Math.random()*13);int c=(int)(Math.random()*12);
				System.out.println("Name is : "+psngr[i]+srnm[k]+"\tPassenger ID is : "+pid[k]+"\tPlane Name is : "+pnam[a]+"\tSource Station is : "+src[b]+"\tDestination is :"+dest[c]);
			}}}}