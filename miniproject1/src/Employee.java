public class Employee {
    int empNo;
    String empName;
    String joinDate;
    char designationCode;
    String department;
    int basic;
    int hra;
    int it;

    public Employee(int empNo, String empName, String joinDate, char designationCode, String department, int basic, int hra, int it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}