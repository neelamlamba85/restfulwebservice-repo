package webservice.webservice.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class userDaoService {
    private static List<user> users=new ArrayList<>();
    private static int usercount=4;
    static {
        users.add(new user(1,"a",new Date()));
        users.add(new user(2,"b",new Date()));
        users.add(new user(3,"c",new Date()));
        users.add(new user(4,"d",new Date()));
    }
    public List<user> findAll() {
        return users;
    }
    public user save(user User)
    {
        if(User.getId()==null)
            User.setId(++usercount);

        users.add(User);
        return User;
    }
    public user findOne(int id)
    {
        for(user User:users)
        {
            if(User.getId()==id)
                return User;
        }
        return null;
    }
}
