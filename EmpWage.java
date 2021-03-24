public class EmpWage
{
	public static void main(String[] args)
	{
		int isPresent = 1;
		int checkPresence = (int) Math.floor(Math.random()*10%2);
		if(isPresent == checkPresence)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
