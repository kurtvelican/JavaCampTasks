package DataAccess.Abstract;

import java.util.List;

import Entities.User;

public interface UserDao {
    void add(User user);
	void update(User user);
	void delete(User user);
	boolean getEmail(String email);
	boolean getPassword(String email);
	List<User> getAll();
}
