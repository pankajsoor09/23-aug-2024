package collection;

public class Student {// HashSet

	private int rollNo;
	private String name;
	private float percentage;

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Student(int rollNo, String name, float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	public boolean equals(Object obj) {
		Student s = (Student) obj;// down casting
		if (this.rollNo == s.rollNo && this.name.equals(s.name) && this.percentage == s.percentage) {
			return true;
		}
		return false;
	}
	
	public int hashCode () {
		return rollNo;
	}

}
