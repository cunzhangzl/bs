package cn.edu.wbu.bs.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Manager {
    private String managerId;
    private String managerPwd;
    private String managerName;
    private int managerGender;
    private String managerAge;
    private String managerTel;
    private String managerRemark;
}
