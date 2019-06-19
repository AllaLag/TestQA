public class EmployeeWithFixedSalary {
	public static int id = 1;
	public static String name = "Alex";
	public static String sex = "male";
	public static int salary = 10000;

	 public static int calculateSalary() {
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
