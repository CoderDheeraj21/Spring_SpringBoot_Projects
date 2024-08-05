package in.Dheeraj.Dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao{
	
	public OracleReportDaoImpl() {
		System.out.println("Oracle ReportDaoImpl Constructor");
	}

	@Override
	public String findData() {
		System.out.println("Fetching report from oracle db...");
		return "Report Data";
	}

}
