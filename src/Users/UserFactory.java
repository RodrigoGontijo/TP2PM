package Users;

import Users.User;

public class UserFactory
{
    public static User getUser(String name){
        User user = new User(name);
        return user;
    }
}
