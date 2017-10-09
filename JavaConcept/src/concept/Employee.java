package concept;

public class Employee implements Comparable<Employee>{

	private int empid;
	private String empname;
	private int age;
	
	public Employee(int empid,String empname,int age){
		this.empid=empid;
		this.empname=empname;
		this.age=age;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub

//----------String comparison		
//	return (this.empname.compareTo(emp.getEmpname()));
		
//---------int comparison		
	/*	if (this.empid==emp.getEmpid()){
			return 0;
		} else if (this.empid>emp.getEmpid()){
			return 1;
		}else{
			return -1;
		}*/
		
//---------int comparison
		if (this.age==emp.getAge()){
			return 0;
		} else if (this.age>emp.getAge()){
			return 1;
		}else{
			return -1;
		}
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
