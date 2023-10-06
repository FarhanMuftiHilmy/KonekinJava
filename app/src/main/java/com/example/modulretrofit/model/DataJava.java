package com.example.modulretrofit.model;

import com.google.gson.annotations.SerializedName;

public class DataJava {
    @SerializedName("id")
    private int id;

    @SerializedName("employee_name")
    private String employeeName;

    @SerializedName("employee_salary")
    private int employeeSalary;

    @SerializedName("employee_age")
    private int employeeAge;

    @SerializedName("profile_image")
    private String profileImage;

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
