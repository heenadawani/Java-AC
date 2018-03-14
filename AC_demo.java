import java.util.*;
class AC_demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{	
			System.out.println("Which AC do you want?");
			System.out.println("1.Personal\n 2.Commercial\n 3.Vehicle\n 4.Quit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					LG l1=new LG();
					System.out.println("LG:");
					l1.maintain_temp();
					l1.capacity();
					l1.type();
				}
			}
		}while(choice!=4);
		
	}
}