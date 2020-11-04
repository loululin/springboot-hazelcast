package com.example.springboothazelcast.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author loulvlin
 * @since 2020-11-04
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("empId")
    private String empId;

    @TableField("empName")
    private String empName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "empId=" + empId +
            ", empName=" + empName +
        "}";
    }
}
