package app.labas.ex05.jdbc;

import java.util.List;
import java.util.Map;

public interface IEmpRepository {
	int getEmpCount();
	int getEmpCont(int deptId);
	
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empId);
	
	void insertEmp(EmpVO emp);
	void updateEmp(EmpVO emp);
	int deleteEmp(int empId, String email);
	
	void deletJobHistory(int empId);  // ← 수정됨
	
	List<Map<String, Object>> getAllDeptID();
	List<Map<String, Object>> getAllJobID();
	List<Map<String, Object>> getAllManagerID();
}