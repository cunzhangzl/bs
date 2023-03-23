package cn.edu.wbu.bs.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Works {
    private int worksId;
    private String worksName;
    private String worksContent;
    private int worksClick;
    private String worksUid;
}
