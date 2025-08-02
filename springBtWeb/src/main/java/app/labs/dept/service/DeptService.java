package app.labs.dept.service;

import app.labs.dept.model.Dept;

import java.util.List;

public interface DeptService {
    int getDeptCount();
    int getDeptCount(int deptno);
    List<Dept> getDeptList();
    Dept getDeptInfo(int deptno);

    void insertDept(Dept dept);
    void updateDept(Dept dept);
    int deleteDept(int deptno);
}
