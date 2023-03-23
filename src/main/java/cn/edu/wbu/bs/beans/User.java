package cn.edu.wbu.bs.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class User {
    private String usersId;
    private String usersPwd;
    private String usersName;
    private int usersAge;
    private String usersGender;
    private String usersTel;
    private String usersRemark;
}
