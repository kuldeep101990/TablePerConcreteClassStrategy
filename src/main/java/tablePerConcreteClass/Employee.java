package tablePerConcreteClass;

//Subclass Employee
public class Employee extends Person{
	    private Double salary;
	    private String title;
		
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
}
