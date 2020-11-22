public class EnumTest1{
	enum Day {
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}

	public static void main (String[] args) {
		Day workday;
		workday = Day.THURSDAY;
		System.out.println("Today is " + workday);
		System.out.println("Yesterday was " + Day.WEDNESDAY);

		System.out.println("Ordinal Value : " + workday.ordinal());

		Day myDay = Day.FRIDAY;

		if (myDay.equals(workday))
			System.out.println("Same Day");
		else
			System.out.println("Different Day");
	}
}
