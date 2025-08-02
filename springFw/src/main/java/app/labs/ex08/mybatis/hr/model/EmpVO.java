
package app.labs.ex08.mybatis.hr.model;



import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
	 private int employeeId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String phoneNumber;
	    private String hireDate;
	    private String jobId;
	    private double salary;
	    private double commissionPct;
	    private Integer managerId;
	    private int departmentId;

}
