package cn.edu.wbu.bs.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;
}
