package com.lzw.springcloud.pojo;


import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ToString
@Accessors
public class Dept implements Serializable {
    private Integer id;
    private String name;
    private String db_source;
}


