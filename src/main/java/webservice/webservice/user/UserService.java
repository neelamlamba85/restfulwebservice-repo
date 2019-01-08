package webservice.webservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserService {
    @Autowired
    private userDaoService service;
    @GetMapping("/users")
    public List<user> retreiveAllUser()
    {
        return service.findAll();
    }
}
