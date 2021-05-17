public class InstructorManager extends UserManager {
    
    public void giveTask(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " gave the " + instructor.getTask());
    }
}
