package concept;

import java.util.Comparator;

public class EmpidComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getEmpid()==o2.getEmpid()){
			return 0;
		} else if (o1.getEmpid()>o2.getEmpid()){
			return 1;
		}else{
			return -1;
		}
	}
	
}
