package app.labs.ex06.mvc02.dao;

import java.util.List;
import java.util.Map;

import app.labs.ex06.mvc02.model.EmpVO;

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