package com.collections;

import concept.Price;

public class ObjectforFun implements Comparable<ObjectforFun>{
	
	private final String name;
	private final int id;
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public ObjectforFun(String str,int id){
		this.name=str;
		this.id=id;
	}

	@Override	
	public int compareTo(ObjectforFun o2) {
		// TODO Auto-generated method stub
//		if(name!=null && o.getName()!=null){
//		return this.name.compareTo(o.getName());
//		}else return 1;
		
		  if (this.name == null && o2.getName() == null) {
		        return 0;
		    }
		    if (o2.getName() == null) {
		        return -1;
		    }else if (this.name == null) {
		        return 1;
		    }
		    //Asc
		    return this.name.compareTo(o2.getName());
		    //Desc
//		    return o2.getName().compareTo(this.name);
	}
	
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        return result;
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		ObjectforFun other = (ObjectforFun) obj;
		if (other.getId()==id && other.getName().equals(name)) {
			return true;
		}else return false;
	}

}
