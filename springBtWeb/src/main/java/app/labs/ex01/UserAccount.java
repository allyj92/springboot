package app.labs.ex01;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {
    String idx;
    String userId;
    String userPwd;
    String userName;
    String userRole;
    List<String> userRoles;
    String userStatus;

}
