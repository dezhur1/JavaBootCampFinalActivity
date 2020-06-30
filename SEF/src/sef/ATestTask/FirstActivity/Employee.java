package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId= 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary= 0;
    }
    public Employee(String firstName, String secondName, int age){
        super(firstName, secondName, age);
    }

    //TODO 2 add getters and setters
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int compareTo(Employee z)
    {
        int res=0;
        if (salary < z.salary) {res=-1;  }
        if (salary > z.salary){res=1;}
        return res;
    }


    //TODO 3 override method announce()
    @Override
    public String announce() {
        // TODO Auto-generated method stub
        return super.announce()+ "I work as " + getJobTitle() + " in " + getCompanyName() + "";
    }

}
