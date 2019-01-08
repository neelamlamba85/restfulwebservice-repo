package webservice.webservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/users/{id}")
    public user retreive(@PathVariable int id)
    {
      return service.findOne(id);
    }
    @PostMapping
    public void createUser(@RequestBody user User)
    {
      user savedUser=service.save(User);
    }

}
