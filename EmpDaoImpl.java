import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
	Connection conn = null;// 链接对象
	PreparedStatement ptmt = null;// 预编译对象
	ResultSet rs = null;// 处理结果集合

	public void Link() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1522:orcl123", "scott",
					"tiger");
			System.out.println("链接成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void add(int empno, String ename, String job, int mgr,
			String hiredate, int sal, int comm, int deptno) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into emp values(" + empno + ", '" + ename
					+ "', '" + job + "', " + mgr + ", '" + hiredate + "', "
					+ sal + ", " + comm + ", " + deptno + ")";
			ptmt = conn.prepareStatement(sql);
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int empno) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from emp where deptno =" + empno;
			ptmt = conn.prepareStatement(sql);
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int empno, String src, Object srcValue, String tar,
			Object tarValue) {
		// TODO Auto-generated method stub
		try {
			String sql = "update dept set " + tar + "=" + tarValue + "where"
					+ src + "=" + srcValue;
			ptmt = conn.prepareStatement(sql);
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Emp query(int empno) {
		// TODO Auto-generated method stub
		Emp ret = null;
		try {
			String sql = "select * from emp where deptno =" + empno;
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			ret = new Emp(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getInt(7),
					rs.getInt(8));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public List<Emp> query_all() {
		// TODO Auto-generated method stub
		List<Emp> list = new ArrayList<Emp>();
		try {
			String sql = "select *  from emp";
			ptmt = conn.prepareStatement(sql);
			ptmt.executeUpdate();
			rs = ptmt.executeQuery();
			while (rs.next()) {
				list.add(new Emp(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4), rs.getDate(5), rs
								.getInt(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {
		EmpDaoImpl EmpDao = new EmpDaoImpl();
		EmpDao.Link();
		List<Emp> list = EmpDao.query_all();
		for (Emp emp : list) {
			System.out.println(emp);
		}

//		EmpDao.add(20, "ZHAO", "CLERK", 1234, "01/9月/2015", 123, 456, 10);
	}
}
