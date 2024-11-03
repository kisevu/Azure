package com.ameda.kevin.azure_services.entity;
/*
*
@author ameda
@project Azure
*
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Employee {
    private int id;
    private String name;
    private String department;
    private long salary;
}
