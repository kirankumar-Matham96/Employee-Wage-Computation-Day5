public class EmpWage
{
	public static void main(String[] args)
	{
		int isPresent = 1;
		int wagePerHr = 20;
		int fullDayWorkingHrs = 8;
		int empWage = 0;
		int checkPresence = (int) Math.floor(Math.random()*10%2);
		if(isPresent == checkPresence)
		{
			System.out.println("Employee is present");
			empWage = wagePerHr * fullDayWorkingHrs;
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("Employee Wage is: "+empWage);
	}
}
