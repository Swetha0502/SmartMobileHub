
import java.util.Scanner;

public class Driver {
		static Scanner sc= new Scanner(System.in);
		public static void main(String[] args) 
		{
			Mobile m1= new Mobile("Vivo" , "4Gb", 500000);
			boolean flag=true;
			do
			{
				System.out.println("\t\t\tSelect the input");
				System.out.println(" 1.View Mobile Details \n 2.View Sim Details \n 3.Insert Sim \n 4.Remove Sim \n 5.Check Sim Present Or Not \n 6.Exit");
				int input = sc.nextInt();

				switch (input)
				{
				case 1:{
					m1.detailsOfMobile();
					break;}//MobileDetails
				case 2:{
					if (m1.isSimPresent())
					{
						m1.tray.detailsOfSim();
					}
					else
					{
						System.out.println("There is no Sim to display.");
					}
					break;}//SimDetails
				case 3:{
					System.out.println("Enter the Sim name");
					String n =sc.next();
					m1.insertSim(new Sim(n,"5g"));
					break;}//Insert Sim
				case 4:{
					m1.removeSim();
					break;}//RemoveSim
				case 5:{
					if (m1.isSimPresent())
					{
						System.out.println(m1.tray.name + " Sim is present.");
					}
					else
					{
						System.out.println(" Sim is not present.");
					}
					break;}//Check Sim
				case 6:{
					flag=false;
					break;}//Exit
				
				}
			}
			while (flag);
				
		}
}
