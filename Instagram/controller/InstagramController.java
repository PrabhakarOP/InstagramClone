package Instagram.controller;

import Instagram.User;
import Instagram.service.impl.UserServiceImpl;

public class InstagramController {
    UserServiceImpl userService =new UserServiceImpl();

    public User signup(String userName, String password, String phoneNumber, String email){

        return userService.signup(userName,password,phoneNumber,email);

    }

    public boolean signin(String userName, String password){
        return userService.signin(userName,password);
    }

    public void updateBio(String userName,String bio){
        userService.updateBio(userName,bio);
    }
    public void showBio(String userName){
        userService.showBio(userName);
    }
}
