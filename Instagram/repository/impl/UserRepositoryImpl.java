package Instagram.repository.impl;

import Instagram.User;

import java.util.ArrayList;

public class UserRepositoryImpl {
    ArrayList<User> userList=new ArrayList<>();

    public void save(User user){
        userList.add(user);
    }

    public User signin(String userName,String password){
        for(User i: userList){
            if(i.getUserName().equals(userName) && i.getPassword().equals(password))
                return i;
        }
        return null;
    }

    public User findByUserName(String userName){

        for(User i: userList){
            if(i.getUserName().equals(userName))
                return i;
        }

        return  null;
    }



}
