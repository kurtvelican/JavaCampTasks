package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.UserDao;
import Entities.User;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        
    }

    @Override
    public void delete(User user) {
        
    }

    @Override
    public boolean getEmail(String email) {
        for (User user: users) {
			if(user.getEmail() == email) {
				return true;
			}
		}
		return false;	
    }

    @Override
    public boolean getPassword(String password) {
        for (User user: users) {
			if(user.getPassword() == password) {
				return true;
			}
		}
		return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
    
}
