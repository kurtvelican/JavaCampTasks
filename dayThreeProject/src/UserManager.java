public class UserManager {
    
    public void add(User user){
        System.out.println("User added : " + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail() );
    }

    public void delete(User user){
        System.out.println("User deleted : " + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail() );
    }
}
