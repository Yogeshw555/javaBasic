package day_3;

public class Student {

	
	    int sid;
	    String sname;
	    String city;
	    
	    public void setSid(int sid) {
	    	this.sid=sid;
	    }
	    public int getSid()
	    {
	    	return sid;
	    }
	    public String getSname() {
	    	return sname;
	    }
	    public void setSname(String sname) {
	    	this.sname=sname;
	    }
	    public void setSname(String city) {
	    	this.city=city;
	    }
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
		}
	    
	    	
	    
	

}
