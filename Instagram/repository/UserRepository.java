package Instagram.repository;
import Instagram.User;
import java.util.ArrayList;


public interface UserRepository {
    ArrayList<User> user= new ArrayList<>();

    public User save(User user);
    public User signin(String userName,String password);
    public User findByUserName(String userName);
}
