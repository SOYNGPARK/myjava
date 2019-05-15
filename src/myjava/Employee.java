package myjava;

public class Employee {
	int empID;
	String name;
	String hireDate;
	
	// equals��� �޼ҵ带 override�ؼ� �� �� ���� instanceof�� ����!
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
