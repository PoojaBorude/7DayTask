package awtP;

public class T4 {
	//private int rollno;

	private int no,clinicid,year,month;

	private String proctype;

	public T4() {}

	public T4(int no, String proctype,int year, int month ) {
		super();
		
		this.no = no;
		this.proctype = proctype;
		this.year = year;
		this.month = month;
		
	}

	
	public int getno() {
		return no;
	}
	public void setno(int no) {
		this.no = no;
	}
	public String getproctype() {
		return proctype;
	}
	public void setproctype(String proctype) {
		this.proctype = proctype;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	public int getmonth() {
		return month;
	}
	public void setmonth(int month) {
		this.month = month;
	}


	}
