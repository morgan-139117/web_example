package mysql;

import java.util.LinkedList;
import java.util.Random;
import java.sql.*;



class Thread276 extends Thread {

	public void run() {
		select();
	}

	
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void select() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			// Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://192.168.122.76:3306/abc", "admin", "osv");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			stmt.execute("insert into test(name) values("+randInt(1,200)+");");
			ResultSet rs = stmt.executeQuery("select * from test");

			// user 为你表的名称
			while (rs.next()) {
				System.out.println("76"+rs.getString(1) + "--->" + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}


}


class Thread289 extends Thread {

	public void run() {
		select();
	}

	
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void select() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			// Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://192.168.122.75:3306/abc", "admin", "osv");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			stmt.execute("insert into test(name) values("+randInt(1,200)+");");
			ResultSet rs = stmt.executeQuery("select * from test");

			// user 为你表的名称
			while (rs.next()) {
				System.out.println("89"+rs.getString(1) + "--->" + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}


}

class Thread2l extends Thread {

	public void run() {
		select();
	}

	public static void select() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			// Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql", "admin", "osv");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			stmt.execute("insert into testa select * from testb;");
			ResultSet rs = stmt.executeQuery("select * from testb");

			// user 为你表的名称
			while (rs.next()) {
				System.out.println(rs.getString(1) + "--->" + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}

}

class Thread1 extends Thread {
	public static final int N = 100; // # of terms

	public void run() {
		compute();
	}

	public static void compute() {

		String abc = new String("aaaaaaaaaaaaaaaaaaaaa");
		LinkedList ls = new LinkedList();
		LinkedList[] lsl = new LinkedList[10000000];

		double sum = 0.0; // final sum
		double term; // term without sign
		double sign = 1.0; // sign on each term
		for (int i = 0; i < 50; i++) {
			ls.add(new String(abc.toString()));
		}

		for (int i = 0; i < 1000; i++) {
			lsl[i] = (LinkedList) ls.clone();
		}

		for (int k = 0; k < N; k++) {

			term = 1.0 / (2.0 * k + 1.0);
			sum = sum + sign * term;
			if (k % (N / 50) == 0) // print one in 50
				System.out.println("k: " + k + ", " + sum + ", pi: " + sum
						* 4.0);
			sign = -sign;
		}
		System.out.println("Final pi/4 (approx., " + N + " terms): " + sum);
		System.out.println("Actual pi/4: " + Math.PI / 4.0);
		System.out.println("Final pi (approx., " + N + " terms): " + sum * 4.0);
		System.out.println("Actual pi: " + Math.PI);
	}
}

public class PiSlow {

	public void doSqll() {

		Thread t2 = new Thread2l();
		t2.start();
	}
	
	public void doSql89() {

		Thread t2 = new Thread289();
		t2.start();
	}
	

	public void doSQLnPi() {
		Thread t1 = new Thread1();
		t1.start();
		Thread t2 = new Thread289();
		t2.start();
		Thread t3 = new Thread276();
		t3.start();
	}

	public static void main(String[] args) {

	}
}