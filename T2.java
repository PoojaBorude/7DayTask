package awtP;




public class T2 {
//private int rollno;

//private int no,clinicid,year,month;
private int id,practiceid,age;
private String lastname,firstname,gender,birthdate,apptdate,patientage;



public T2() {}

public T2(int id, int practiceid,String lastname, String firstname,String gender,String birthdate,String patientage,int age ) {
	super();
	
	this.id = id;
	this.practiceid = practiceid;
	this.lastname = lastname;
	this.firstname = firstname;
	this.gender=gender;
	this.birthdate=birthdate;
	this.patientage=patientage;
	this.age=age;
	//this.apptdate=apptdate;
	
	
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

public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public int getpracticeid() {
	return practiceid;
}
public void setpracticeid(int practiceid) {
	this.practiceid = practiceid;
}
public String getlastname() {
	return lastname;
}
public void setlastname(String lastname) {
	this.lastname = lastname;
}
public String getfirstname() {
	return firstname;
}
public void setfirstname(String firstname) {
	this.firstname = firstname;
}
public String getgender(){
	return gender;
}

public void setgender(String gender){
	this.gender=gender;
}

public String getbirthdate(){
	return birthdate;
}

public void setbirthdate(String birthdate){
	this.birthdate=birthdate;
}

public String getpatientage(){
	return patientage;
}

public void setpatientage(String patientage){
	this.patientage=patientage;
}
public int getage()
{
	return age;
}
public void setage(int age){
	this.age=age;
}	
}




