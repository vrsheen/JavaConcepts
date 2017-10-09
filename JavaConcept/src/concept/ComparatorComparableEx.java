package concept;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee(1, "Sheen", 10);
		Employee emp2=new Employee(2, "Shean", 8);
		Employee emp3=new Employee(5, "Abagel", 9);
		Employee emp4=new Employee(3, "Zulu", 30);
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp4);
		emplist.add(emp3);
		emplist.add(emp1);
		emplist.add(emp2);
		sysoutString(emplist,"Object Without Sorting");
		
		Collections.sort(emplist);
		sysoutString(emplist,"Object using Comparable Age Sorting");
		
		Collections.sort(emplist,new EmpNameComparator());
		sysoutString(emplist,"Using EmpNameComparator");
		
		Collections.sort(emplist,new EmpidComparator());
		sysoutString(emplist,"Using EmpidComparator");
	}
	
	public  static void sysoutString(ArrayList<Employee> emplist, String disText){
		for(Employee empobj:emplist){
			System.out.println(disText+" = "+empobj.getEmpid()+" - "+ empobj.getEmpname()+" - "+empobj.getAge());
		}
	}

}
