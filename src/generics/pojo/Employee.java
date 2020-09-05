package generics.pojo;

public class Employee extends Person {
	private int eId;
	private String designation;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", designation=" + designation + "]";
	}

}
