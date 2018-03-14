public abstract class Personal_ac implements AC
{
	public void maintain_temp()
	{
		System.out.println("The temp range maintained by this personal ac is from 16-32");
	}
	public void capacity()
	{
		System.out.println("The capacity of this ac is 1 tonn");
	}
	abstract void type();
}