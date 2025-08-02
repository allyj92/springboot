package app.labs.dept.dao;

import app.labs.dept.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptRepository {
    int getDeptCount();
    int getDeptCount(@Param("deptno") int deptno);
    List<Dept> getDeptList();
    Dept getDeptInfo(int deptno);
    void updateDept(Dept dept);
    void insertDept(Dept dept);
    int deleteDept(@Param("deptno") int deptno);
}
