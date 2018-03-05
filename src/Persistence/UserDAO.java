package Persistence;

import Model.User;

public interface UserDAO {
    public void insert(User user);
    public void remove(User user);
    public void change(User user);
    public User searchForId(int id);
}
