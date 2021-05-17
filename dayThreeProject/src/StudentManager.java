public class StudentManager extends UserManager {

    public void attend(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " attened the " + student.getMyCourses() + " course");
    }

    public void leave(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() +" left the " + student.getMyCourses() + " course");
    }
}
