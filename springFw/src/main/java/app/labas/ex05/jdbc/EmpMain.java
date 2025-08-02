package app.labas.ex05.jdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

    public static void main(String[] args) {
        // Spring 컨테이너 생성 및 설정파일 로딩
        AbstractApplicationContext context = 
                new GenericXmlApplicationContext("classpath:config/jdbc01/application-config.xml");

        // EmpService 빈 가져오기
        IEmpService empService = context.getBean("empService", IEmpService.class);

        // 사원 수 출력
        System.out.println("-- 사원수 조회 --");
        System.out.println("전체 사원 수: " + empService.getEmpCount());
        System.out.println("전체 사원 수: " + empService.getEmpCount(50));
        
        System.out.println("-- 103번 사원 -- ");
        System.out.println(empService.getEmpInfo(103));
        
        System.out.println("-- 전체 사원 -- ");
        System.out.println(empService.getEmpList());
        
        /* 무결성 제약 조건 - emali
        System.out.println("-- 새로운 사원 정보를 입력합니다.");
                EmpVO emp = new EmpVO();
                emp.setEmployeeId(210);
                emp.setFirstName("JinKyoung");
                emp.setLastName("Heo");
                emp.setEmail("HEOJK");
                emp.setPhoneNumber("222-222");
                emp.setJobId("IT_PROG");
                emp.setSalary(8000);
                emp.setCommissionPct(0.2);
                emp.setManagerId(100);
                emp.setDepartmentId(10);
                try {
                    empService.insertEmp(emp);
                    System.out.println("insert ok");
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }
        */
//                EmpVO emp210 = empService.getEmpInfo(210);
//                System.out.println(emp210);
                
               
//                
//        System.out.println("-- 210번 사원의 급여를 10% 인상시킵니다.");
//        emp210.setSalary(emp210.getSalary()*1.1);
//        empService.updateEmp(emp210);

        
        System.out.println("-- 모든 부서번호와 부서이름 정보를 출력합니다.");
        System.out.println(empService.getAllDeptID());

        System.out.println("-- 모든 직무아이디와 직무타이틀을 출력합니다.");
        System.out.println(empService.getAllDeptID());

        System.out.println("-- 모든 매니저번호와 매니저이름을 출력합니다.");
        System.out.println(empService.getAllManagerID());
                
        // 컨텍스트 종료
        context.close();
    }
}