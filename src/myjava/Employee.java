package myjava;

public class Employee {
	int empID;
	String name;
	String hireDate;
	
	// equals라는 메소드를 override해서 쓸 때 에서 instanceof를 쓴다!
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj ;
			if(emp.empID == this.empID && name.equals(emp.name)) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
