package prob4;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String department) {
		super.setName(name);
		super.setSalary(salary);
		this.department = "기획부";
	}
	
	public void getInformation() {
		System.out.printf("이름: %s    연봉: %d    부서: %s%n", super.getName(), super.getSalary(), department);
	}
	
}
