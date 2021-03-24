public class EmpWage
{
	public static void main(String[] args)
	{
		int isPresent = 1;
		int isFullTime = 1;
		int wagePerHr = 20;
		int fullTimeWorkingHrs = 8;
		int partTimeWorkingHrs = 4;
		int empWage = 0;
		int checkPresence = (int) (Math.random()*10%2);
		int checkWorkingTime = (int) (Math.random()*10%2);
		if(isPresent == checkPresence)
		{
			System.out.println("Employee is present");
			if(isFullTime == checkWorkingTime)
			{
				System.out.println("Employee is full timer");
				empWage = fullTimeWorkingHrs * wagePerHr;
			}
			else
			{
				System.out.println("Employee is part timer");
				empWage = partTimeWorkingHrs * wagePerHr;
			}
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("Employee Wage is: "+empWage);
	}
}
