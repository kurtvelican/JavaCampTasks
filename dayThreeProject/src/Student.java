public class Student extends User{
    
    private String myCourses;

    public Student(){

    }

    public Student(String firstName, String lastName, String email, String myCourses) {
        super(firstName, lastName, email);
        this.myCourses = myCourses;
    }

    public String getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String myCourses) {
        this.myCourses = myCourses;
    }
    


}
