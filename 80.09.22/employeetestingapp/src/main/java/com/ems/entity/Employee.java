package com.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Employee {
private long empId;
private String empName;
private double empSal;

//entity referance 
Address address; // "HAS- A relationship/association"
}
