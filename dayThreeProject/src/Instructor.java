public class Instructor extends User {
    
    private String task;

    public Instructor(){

    }

    public Instructor(String firstName, String lastName, String email, String task) {
        super(firstName, lastName, email);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

}
