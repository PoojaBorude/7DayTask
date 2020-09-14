package awtP;


public class T1 {
//private int rollno;

private int no,clinicid,year,month;



public T1() {}

public T1(int no, int clinicid,int year, int month ) {
	super();
	
	this.no = no;
	this.clinicid = clinicid;
	this.year = year;
	this.month = month;
	
}

/*public Student(String name1,String name, String email, String course, int fee, int paid, int due, String address,
		String city, String state, String country, String contactno) {
	super();
	//this.rollno = rollno;
	this.name = name;
	this.email = email;
	this.course = course;
	this.fee = fee;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.city = city;
	this.state = state;
	this.country = country;
	this.contactno = contactno;
}

public String getname1() {
	return name;
}
public void setname(String name1) {
	this.name = name1;
}*/

public int getno() {
	return no;
}
public void setno(int no) {
	this.no = no;
}
public int getclinicid() {
	return clinicid;
}
public void setclinicid(int clinicid) {
	this.clinicid = clinicid;
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

