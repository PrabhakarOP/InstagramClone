package Instagram.service;

import Instagram.User;

public interface UserService {
    public User signup(String userName, String password, String phoneNumber, String email);
    public boolean singin(String userName,String password);
    public void updateBio(String userName,String bio);
    public void showBio(String userName);
}
