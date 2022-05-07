package com.example.accessdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Step 3: controller to handle HTTP requests to application
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // http://localhost:8080/add?name=John&email=john@gmail.com
    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);
        return "User "+name+" added successfully!";
    }
    //http://localhost:8080/all
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    //URL: http://localhost:8080/test?testMsg=test message&msg2=second message
    @GetMapping("/test")
    public @ResponseBody String test(@RequestParam(value = "testMsg", defaultValue = "Nothing ")String msg, @RequestParam(value="testMsg2", defaultValue = "test message 2") String msg2){
        return msg+" & "+msg2;
    }
}
