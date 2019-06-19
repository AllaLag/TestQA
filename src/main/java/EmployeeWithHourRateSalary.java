public class EmployeeWithHourRateSalary {
	public static int id = 1;
	public static String name = "Anna";
	public static String sex = "female";

	public static int calculateSalary() {
		int rate = 31;
		int salary = (int) (20.8 * 8 * rate);
		return salary;
	}

	public static void printSalary() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(calculateSalary());
	}

		public static void main(String[] args) {
			printSalary();
			System.out.println();
		}
	}
