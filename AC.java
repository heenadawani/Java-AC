import java.util.*;
public interface AC
{
	void maintain_temp();
	void capacity();
}
abstract class Personal_ac implements AC
{
	void maintain_temp()
	{
		System.out.println("The temp range maintained by this personal ac is from 16-32");
	}
	void capacity()
	{
		System.out.println("The capacity of this ac is 1 tonn");
	}
	void type();
}
class LG extends Personal_ac
{
	String type;
	LG(String type)
	{
		this.type=type;
	}
	void type()
	{
		System.out.println("The type of ac is "+type);
	}
}
class AC_demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String type;
		System.out.println("Enter the type of personal ac");
		type=sc.next();
		LG l1=new LG(type);
		System.out.println("LG:");
		l1.maintain_temp();
		l1.capacity();
		l1.type();
	}
}