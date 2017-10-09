package concept;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.getEmpname().compareTo(o2.getEmpname()));
	}

}
