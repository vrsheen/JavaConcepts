package concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		String[] str={"sam","john","ranjan","sam","twinkle","ranjan","john"};
		List<String> newl=Arrays.asList(str);
		ArrayList<String> astr=new ArrayList<String>(newl);
		TreeSet<String> trestr=new TreeSet<String>(astr);
		TreeSet<String> dupstr=new TreeSet<String>();

		for(String strvar:str){
			if(!trestr.add(strvar)){
				dupstr.add(strvar);
			}
		}
		sysoutStr(dupstr);
		
		
		
//		int[] feb = new int[febCount];
//		feb.length-1;
//		
	}
	
	public static void sysoutStr(TreeSet<String> treestr){
		for(String str:treestr){
			System.out.println(str);
		}
	}

}
