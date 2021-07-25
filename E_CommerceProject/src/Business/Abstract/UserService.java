package Business.Abstract;

import Entities.User;

public interface UserService {
    public void signUp(User user);
    public void sendValidationEmail();
    public void validation();
    public void signIn(User user);
}
