package Infy_Tryout_increment_Decrement_operators;

public class ObjectClassDemo {

	private int empNo;
	private String empName;
	
	public ObjectClassDemo (int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		}
		public String tostring() {
			return "Employee  [empNo=" + empNo + ", empName=" + empName +"]";
		}
		public int hashcode() {
			return empNo;
		}
		public boolean equals(ObjectClassDemo obj) {
			if (empNo == obj.empNo) {
				if (empName.equals(obj.empName)) {
					return true;
				}
			}
			return false;
		}
	
	
		
	public static void main(String[] args) {
		ObjectClassDemo emp1 = new ObjectClassDemo (1, "Son");
		ObjectClassDemo emp2 = new ObjectClassDemo (1, "Son");
		ObjectClassDemo emp3 = new ObjectClassDemo (2, "JOHN");
		
		System.out.println(emp1.getClass());
		
		System.out.println("NIS Employee equals employee2 :" + emp1.equals(emp2));
		System.out.println("Hashcode values of employee1 and employee2: " + emp1.hashcode() + "" + emp2.hashcode());
	

}
}