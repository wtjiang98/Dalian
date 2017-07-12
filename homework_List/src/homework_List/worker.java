package homework_List;

public class worker {
	double sal;
	String id, name, job;
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public worker(double sal, String id, String name, String job) {
		super();
		this.sal = sal;
		this.id = id;
		this.name = name;
		this.job = job;
	}
	
}
