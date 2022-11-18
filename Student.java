package studentManagementSystem;

public class Student {
private  int sid;
private String sname;
private String sphone;
private String city ;


public Student(int sid, String sname, String sphone, String city) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sphone = sphone;
	this.city = city;
	
}


public Student() {
	super();
}


public Student(String sname, String sphone, String city) {
	super();
	this.sname = sname;
	this.sphone = sphone;
	this.city = city;
}


@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + ", city=" + city + "]";
}


public int getSid() {
	return sid;
}


public void setSid(int sid) {
	this.sid = sid;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
}


public String getSphone() {
	return sphone;
}


public void setSphone(String sphone) {
	this.sphone = sphone;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}



}
