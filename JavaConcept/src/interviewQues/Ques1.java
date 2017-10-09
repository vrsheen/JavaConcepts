package interviewQues;

import java.util.ArrayList;
import java.util.List;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question
		// number means add, Z-remove previous num, X-twice of previous number,+ - sum of last 2 number
		Ques1 obj=new Ques1();
		String[] arr={"5","-2","4","Z","X","9","+","+"};
		System.out.println("Total Sum is ="+obj.targetSum(arr));
	}
	
	public int targetSum(String[] buffstr){
		List<Integer> arrlst=new ArrayList<Integer>();
		int totsum=0;
		for (int i = 0; i < buffstr.length; i++) {
			if(checkInt(buffstr[i].toString())){
				arrlst.add(Integer.parseInt(buffstr[i]));
			}else if(buffstr[i].equals("X")){
				arrlst.add((arrlst.get(arrlst.size()-1))*2);
			}else if(buffstr[i].equals("+")){
				arrlst.add((arrlst.get(arrlst.size()-1))+(arrlst.get(arrlst.size()-2)));
			}else if(buffstr[i].equals("Z")){
				arrlst.remove(arrlst.get(arrlst.size()-1));
			}
		}
		
		for (Integer i:arrlst){
			totsum=totsum+i.intValue();
		}
		return totsum;
	}
	
	public boolean checkInt(String str){
		try{
			int i=Integer.parseInt(str);
			return true;
		}
		catch(Exception e){
			return false;
			}
		}
		
	}

