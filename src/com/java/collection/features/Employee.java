package com.java.collection.features;

public class Employee implements Comparable<Object> {

	public Employee(Integer eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	private Integer eId;
	private String eName;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

//
//	@Override
//	public int compareTo(Integer I) {
//        Integer eid1=this.eId;
//        Integer eid2=I;
//        if(eid1<eid2)
//		  return -1;
//        else if(eid1>eid2)
//          return +1;
//        else
//          return 0;
//	}

	@Override
	public int compareTo(Object o) {
		Integer eid1 = this.eId;
		Employee e = (Employee) o;
		Integer eid2 = e.geteId();
		if (eid1 < eid2)
			return -1;
		else if (eid1 > eid2)
			return +1;
		else
			return 0;
	}

}
