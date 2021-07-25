package Business.Concrete;

import Business.Abstract.UserService;
import Entities.User;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService{

    ArrayList<User>emailCheck=new ArrayList<User>();
    
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(regex);
    public Scanner input = new Scanner(System.in);

   
    
    

    @Override
    public void validation() {
        System.out.println("Signed up with e-mail");
    }

    @Override
    public void sendValidationEmail() {
        System.out.println("To verify your e-mail please click here.");
        validation();
    }

    @Override
    public void signUp(User user) {
        
        Matcher matcher = pattern.matcher(user.getEmail());
        

            for (User currentUser : emailCheck){
                if (currentUser.getEmail() == user.getEmail()){
                    System.out.println(user.getEmail() + " is not unique.You can't use this e-mail. Please use different e-mail.");
                }
                else{
                    System.out.println(user.getEmail() + " is unique.You can use this e-mail.");
                }
            } 
        
            if(user.getFirstName().length() < 2 || user.getFirstName().length() < 2 || user.getPassword().length() < 6 || !matcher.matches()){
                System.out.println("You entered wrong values.Please try again.");
            }
            else{
                System.out.println("We send a validation e-mail.Please verify your e-mail.");
                sendValidationEmail();
            }
    }

    

    @Override
    public void signIn(User user) {
        
        System.out.print("Enter your e-mail -> ");
        String email = input.next();   
        System.out.print("Enter your password -> ");
        String password = input.next();    
        
        if(!password.equals(user.getPassword()) || !email.equals(user.getEmail())){
            System.out.println("Your password/e-mail is not correct.Please try again.");
        }
        else{
            System.out.println("Signed In with e-mail");
        }
    }
    
}
