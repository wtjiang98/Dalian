import java.sql.Date;
import java.util.List;

public interface EmpDao {
	public List<Emp> query_all();
	public void add(int empno, String ename, String job, int mgr, String hiredat, int sal, int comm, int deptno);
	public void delete(int empno);
	public void update(int empno, String src, Object srcValue, String tar,  Object tarValue);
	public Emp query(int empno);
}