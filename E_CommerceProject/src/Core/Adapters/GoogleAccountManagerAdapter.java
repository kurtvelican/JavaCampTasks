package Core.Adapters;

import Business.Abstract.UserService;
import Core.Concrete.GoogleAccountManager;
import Entities.User;

public class GoogleAccountManagerAdapter implements UserService {
    
    @Override
    public void signIn(User user) {
        GoogleAccountManager googleAccountManager = new GoogleAccountManager();
        googleAccountManager.signIn(user);
    }

    
    @Override
    public void signUp(User user) {
        GoogleAccountManager googleAccountManager = new GoogleAccountManager();
        googleAccountManager.signUp(user);
    }

    @Override
    public void sendValidationEmail() {
        
    }

    @Override
    public void validation() {
        
    }

}
