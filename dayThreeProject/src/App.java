public class App {
    public static void main(String[] args) throws Exception {

        User user = new User("Veli Can","Kurt","asfadf@gmail.com");
        UserManager userManager = new UserManager();
        userManager.add(user);
        userManager.delete(user);

        Student student = new Student("Ali","Kar","asfdgs@gmail.com","java");
        StudentManager studentManager = new StudentManager();
        studentManager.attend(student);
        studentManager.leave(student);

        Instructor instructor = new Instructor("Engin","Demiroğ","hfddvs@gmail.com","Task1");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.giveTask(instructor);
    }
}
