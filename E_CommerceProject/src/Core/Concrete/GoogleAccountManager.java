package Core.Concrete;

import Business.Concrete.UserManager;
import Entities.User;

public class GoogleAccountManager extends UserManager {

      @Override
      public void signUp(User user){
        System.out.println("Signed up with google account");
      }

      @Override
      public void signIn(User user) {
        User googleUser = new User("Can","Aslan","afdadnbbdfgda@gmail.com","1354232");  //hali hazırda bir google hesabı olduğu için default olarak bir mail tanımladım.
        System.out.println();   
        System.out.print("Enter your e-mail -> ");
        String email = input.next();  
        System.out.print("Enter your password -> ");
        String password = input.next();    
        

        if(!password.equals(googleUser.getPassword()) || !email.equals(googleUser.getEmail())){
            System.out.println("Your password/e-mail is not correct.Please try again.");
        }
        else{
            System.out.print("Signed In with Google Account");
        }
      }
}
