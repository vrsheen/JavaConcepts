package interviewQues;
import java.util.*;
import java.util.Map.Entry;
public class AmazonQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the maxAssociation Group for the given array
		AmazonQues2 obj=new AmazonQues2();
		String[][] strarr=new String[][]{
			{"text7","text8"},
			{"text4","text5"},
			{"text1","text2"},
			{"text8","text9"},
			{"text4","text10"},
			{"text10","text11"}
		};
		System.out.println("Proc1 Max Association Group is "+obj.assocGroup(strarr));
		System.out.println("The Max Association Group is "+obj.maxAssocGrp(strarr));
	}
	
	public String maxAssocGrp(String[][] str){
		
		List<String> grpColl=new ArrayList<String>();
		int pos=-1;String[] colVal;int maxlen=0;String maxVal="";
		String grpCache="";String rowCache="";String sep="";boolean found=false;
		for(int i=0;i<str.length;i++){
			pos=-1;rowCache="";sep="";
			for(int j=0;j<str[i].length;j++){
				found=false;
				grpCache=str[i][j];
				if(pos==-1){
					pos=findInLst(grpColl,grpCache);
					if (pos>=0)found=true;
				}
				
				if(!found){
					rowCache=rowCache+sep+grpCache;
					sep=",";
				}
			}
			System.out.println(rowCache);
			if(pos>=0){
				 grpColl.set(pos,grpColl.get(pos).concat(sep+rowCache));
			 }else{
				 grpColl.add(rowCache);
			 }
		}
		 
		for(String strr:grpColl){
			colVal=strr.split(",");
			if(maxlen<colVal.length){
				maxlen=colVal.length;
				maxVal=strr;
			}
		}
		
		return maxVal;
	}
	
	public int findInLst(List<String> grpLst,String findStr){
		String str="";
		for(int i=0;i<grpLst.size()-1;i++){
			 str=grpLst.get(i);
			if(str.contains(findStr)){
				return i;
			}
		}
		return -1;
	}
	
	public List<String> assocGroup(String[][] str)
	{
		String valpos="";boolean samerow=false;
		Map<String,List<String>> assgrp=new TreeMap<String, List<String>>();
		IdentityHashMap<String,String> mp=new IdentityHashMap<String,String>();
		for (int  i= 0;  i< str.length; i++) {
			samerow=false;
			for (int j = 0; j < str[i].length; j++) {
				
				if(j==0){
					valpos=getKeyByValue(assgrp,str[i][j]);
				}	
				if(j==0 && valpos!=null){
					continue;
				}	
				
				if (valpos!=null){
					samerow=true;
				}else{
					valpos=str[i][j];
				}
							
				 if(samerow==true){
						assgrp.get(valpos).add(str[i][j]);
				 } else{
					 	assgrp.put(str[i][j],new ArrayList<String>());
						assgrp.get(str[i][j]).add(str[i][j]);
					}
			}
		}
		return (assgrp.get(getMaxassoc(assgrp)));
	}
		
	
	public String getKeyByValue(Map<String,List<String>> testMap, String value) {
		  for (Entry<String,List<String>> entry : testMap.entrySet()) {
	            if (entry.getValue().contains(value)) {
	            	return entry.getKey().toString();
	            }
	        }
	    return null;
	}
	
	public String getMaxassoc(Map<String,List<String>> testMap) {
		int maxval=0;
		String maxkey=null;
		  for (Entry<String,List<String>> entry : testMap.entrySet()) {
	            if (entry.getValue().size()>maxval) {
	            	maxval=entry.getValue().size();
	            	maxkey=entry.getKey().toString();
	            }
	        }
	    return maxkey;
	}

}


