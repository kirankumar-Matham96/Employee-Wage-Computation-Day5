public class EmpWage
{
	static int checkPresence = 0;
	static int checkWorkingTime = 0;
	static int wagePerHr = 20;
	static int empDailyWage = 0;

	//Checking employee attendance
	public static int empPresence()
	{System.out.println("empPresence");
		checkPresence = (int) (Math.random()*10%2);
		return checkPresence;
	}

	//Checking employee working time
	public static int empType() //Type: Full_time/Part_time
	{System.out.println("empType");
		checkWorkingTime = (int) (Math.random()*10%2);
		return checkWorkingTime;
	}

	//wage calculation
	public static int empWage(int WorkingHrs)
	{System.out.println("empWage");
		empDailyWage = WorkingHrs * wagePerHr;
System.out.println("empDailyWage: "+empDailyWage);
		return empDailyWage;
	}

	public static void main(String[] args)
	{
		final int isPresent = 1;
		final int isFullTime = 1;
		int fullTimeWorkingHrs = 8;
		int partTimeWorkingHrs = 4;
		int workingDaysInMonth = 20;
		int maxWorkingHrs = 100;
		int dayOfMonth = 0;
		int empMonthlyWage = 0;
		int totalWorkingHrs = 0;
		while(dayOfMonth < workingDaysInMonth && totalWorkingHrs < maxWorkingHrs)
		{
			dayOfMonth++;
			switch(empPresence())
			{
				case isPresent:
					switch(empType())
					{
						case isFullTime:
							empMonthlyWage += empWage(fullTimeWorkingHrs);
							totalWorkingHrs += fullTimeWorkingHrs;
							break;
						default:
							empMonthlyWage += empWage(partTimeWorkingHrs);
							totalWorkingHrs += partTimeWorkingHrs;
					}
					break;
				default:
					System.out.println("Employee is absent!");
			}
		}
		System.out.println("Employee monthly wage is: "+empMonthlyWage);
	}
}
