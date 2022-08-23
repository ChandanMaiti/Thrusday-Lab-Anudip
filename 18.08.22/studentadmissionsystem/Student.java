package studentadmissionsystem;

public class Student {
private int StudentId;
private String StudentName;
private String EmailId;
private long PhoneNo;

public int getStudentId() {
	return StudentId;
}

public void setStudentId(int StudentId) {
	this.StudentId = StudentId;
}

public String getStudentName() {
	return StudentName;
}

public void setStudentName(String StudentName) {
	this.StudentName = StudentName;
}

public String getEmailId() {
	return EmailId;
}

public void setEmailId(String EmailId) {
	this.EmailId = EmailId;
}
public long getPhoneNo() {
	return PhoneNo;
}

public void setPhoneNo(long PhoneNo) {
	this.PhoneNo = PhoneNo;
}
public Student(int StudentId, String StudentName,String EmailId,long PhoneNo) {
	super();
	this.StudentId = StudentId;
	this.StudentName =StudentName;
	this.EmailId =EmailId;	
	this.PhoneNo =PhoneNo;	
}
public Student() {
	super();
}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", EmailId=" + EmailId
				+ ", PhoneNo=" + PhoneNo + "]";
	}

	public static void main(String[] args) {


	}

	

}
