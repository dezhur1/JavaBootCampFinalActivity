package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    public Student() {
        this.schoolName = "Unknown";
    }
    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    @Override
    public String announce() {
        // TODO Auto-generated method stub
            return super.announce() + "I study in the university " + getSchoolName() + ". ";
    }


}
