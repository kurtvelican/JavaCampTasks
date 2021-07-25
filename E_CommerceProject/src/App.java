import Business.Concrete.UserManager;
import Core.Adapters.*;
import Entities.User;

public class App extends UserManager {
    public static void main(String[] args) throws Exception {
        UserManager userManager = new UserManager();
        User user = new User("Veli Can","Kurt","afdgsada@gmail.com","135463332");
        User user2 = new User("ali","aga","adsgfd@gmail.com","135432131215");
        User user3 = new User("hasan","kanca","gsfdhgfjh@gmail.com","13542351215");
        User user4 = new User("ulaş","kafa","adsgfd@gmail.com","13542143515");
        User user5 = new User("eren","mermer","jghfdgsf@gmail.com","13315415");
        userManager.signUp(user2);
        userManager.signUp(user4);
        userManager.signIn(user3);
        userManager.signIn(user5);
        GoogleAccountManagerAdapter googleAccountManagerAdapter = new GoogleAccountManagerAdapter();
        googleAccountManagerAdapter.signUp(user);
        googleAccountManagerAdapter.signIn(user);

    }
}
