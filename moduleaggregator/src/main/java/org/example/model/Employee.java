package org.example.model;

public class Employee {

        private int empid;
    
        private String empName;
    
        public int getEmpid() {
            return empid;
        }
    
        public void setEmpid(int empid) {
            this.empid = empid;
        }
    
        public String getEmpName() {
            return empName;
        }
    
        public void setEmpName(String empName) {
            this.empName = empName;
        }
    
        public Employee(int empid, String empName) {
            super();
            this.empid = empid;
            this.empName = empName;
        }
    
        public Employee() {
            super();
        }
    
        @Override
        public String toString() {
            return "Employee [empid=" + empid + ", empName=" + empName + "]";
        }
    
    }
    
      

