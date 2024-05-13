package Instagram.service.impl;

import Instagram.User;
import Instagram.repository.impl.UserRepositoryImpl;

public class UserServiceImpl {
    UserRepositoryImpl UserRepo=new UserRepositoryImpl();

    public User signup(String userName , String password, String phoneNumber, String email){
        User user=new User(userName,password,phoneNumber,email);
        UserRepo.save(user);
        return user;
    }

    public  boolean signin(String userName,String password){
        User user=UserRepo.signin(userName,password);
        if(user==null) {
            System.out.println("naikhe bhail! feru se try kara.");
            return false;
        }
        else{
            System.out.println("ho gail");
            return true;
        }

    }

    public void updateBio(String userName,String bio){
        User user=UserRepo.findByUserName(userName);
        if(user!=null){
//            UserRepo.setBio(userName,bio);
            user.setBio(bio);
        }
    }

    public void showBio(String userName){
        User user= UserRepo.findByUserName(userName);
        System.out.println(user.getBio());
    }
}

