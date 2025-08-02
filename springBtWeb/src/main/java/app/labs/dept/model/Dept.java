package app.labs.dept.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dept {
    private int deptNo;
    private String dName;
    private String loc;
}
