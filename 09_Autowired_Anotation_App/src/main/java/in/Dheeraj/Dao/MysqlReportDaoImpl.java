package in.Dheeraj.Dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportDaoImpl implements ReportDao{

	@Override
	public String findData() {
		System.out.println("Fetching report from mysql db...");
		return "Report Data";
	}	


}
