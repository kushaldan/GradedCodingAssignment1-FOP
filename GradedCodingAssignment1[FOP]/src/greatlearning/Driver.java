package greatlearning;

public class Driver {
	public static void main(String[]args) {
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
	
System.out.println("Welcome to "+ admin.departmentName() + "\n" + admin.getTodaysWork() + "\n" + admin.getWorkDeadline() + "\n"+ admin.isTodayHoliday());
System.out.println();
System.out.println("Welcome to "+ hr.departmentName() + "\n" + hr.doActivitye()+"\n"+ hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n"+ hr.isTodayHoliday());
System.out.println();
System.out.println("Welcome to "+ tech.departmentName() + "\n" + tech.getTodaysWork() + "\n" + tech.getWorkDeadline() + "\n"+ tech.getTechStackInformation()+ "\n"+ tech.isTodayHoliday());
	}
}