package ru.company.entity;

public class Department {
     private String departmentName;
     private int departmentCode;
     private int departmentHead;

     public Department(String departmentName, int departmentCode, int departmentHead) {
          this.departmentName = departmentName;
          this.departmentCode = departmentCode;
          this.departmentHead = departmentHead;
     }

     @Override
     public String toString() {
          return "Department{" +
                  "departmentName='" + departmentName + '\'' +
                  ", departmentCode=" + departmentCode +
                  ", departmentHead=" + departmentHead +
                  '}';
     }

     public Department() {
     }

     public String getDepartmentName() {
          return departmentName;
     }

     public void setDepartmentName(String departmentName) {
          this.departmentName = departmentName;
     }

     public int getDepartmentCode() {
          return departmentCode;
     }

     public void setDepartmentCode(int departmentCode) {
          this.departmentCode = departmentCode;
     }

     public int getDepartmentHead() {
          return departmentHead;
     }

     public void setDepartmentHead(int departmentHead) {
          this.departmentHead = departmentHead;
     }
}
