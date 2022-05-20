/**Program to demonstrate the real time use of Constructor and NSV*/
public class Flower {
	//Declaring the non static variables
	String name;
	int petals;
	String color;
	float size;
	//Declaring constructor 
	Flower(String name)
	{
		this.name=name;
		petals=20;
		color="Red";
		size=20.5f;
		System.out.println(" Name of the flower is: "+name+
				"\n No of petals is: "+petals+
				"\n Color of the flower is: "+color+
				"\n Size of the flower is: "+size+" cms\n\n");
	}
	Flower(int petals)
	{
		 //IV	 //LV
	this.petals=petals;
	name="Lotus";
	color="White";
	size=35.58f;
	System.out.println(" Name of the flower is: "+name+
			"\n No of petals is: "+petals+
			"\n Color of the flower is: "+color+
			"\n Size of the flower is: "+size+" cms");
		
	}
public static void main(String[] args) {
	Flower f1=new Flower("Rose");
	Flower f2=new Flower(15);
	
}
}
