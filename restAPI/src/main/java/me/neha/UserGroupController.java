package me.neha;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserGroupController {

    @Autowired
    UserRespository userRespository;
    
    @Autowired
    UserGroupRespository userGroupRespository;

    @GetMapping("/user")
    public List<User> index(){
        return userRespository.findAll();
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return userRespository.findOne(userId);
    }

    @PostMapping("/user/search")
    public List<User> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return userRespository.findByUserid(searchTerm, searchTerm);
    }

    @PostMapping("/user")
    public User create(@RequestBody Map<String, String> body){
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        String username = body.get("username");
        String password = body.get("password");
        String role = body.get("role");
        String groupname = body.get("groupname");
        return userRespository.save(new User(firstname, lastname,username,password,role,groupname));
    }
    
    @PostMapping("/group")
    public Usergroup createGroup(@RequestBody Map<String, String> body){
        String groupdesc = body.get("groupdesc");
        String groupname = body.get("groupname");
        return userGroupRespository.save(new Usergroup(groupname,groupdesc));
    }
    
    @GetMapping("/group")
    public List<Usergroup> groupindex(){
        return userGroupRespository.findAll();
    }

    @PutMapping("/user/{id}")
    public User update(@PathVariable String id, @RequestBody Map<String, String> body){
        int userId = Integer.parseInt(id);
        User user = userRespository.findOne(userId);
        user.setFirstname(body.get("firstname"));
        user.setLastname(body.get("lastname"));
        user.setUsername(body.get("username"));
        user.setPassword(body.get("password"));
        user.setRole(body.get("role"));
        user.setGroupname(body.get("groupid"));
        return userRespository.save(user);
    }

    @DeleteMapping("user/{id}")
    public boolean delete(@PathVariable String id){
        int userId = Integer.parseInt(id);
        userRespository.delete(userId);
        return true;
    }


}