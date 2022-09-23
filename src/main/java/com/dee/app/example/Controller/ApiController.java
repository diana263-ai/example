package com.dee.app.example.Controller;

import com.dee.app.example.Repo.UserRepo;
import com.dee.app.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ApiController {


    //injecting our user repository
    @Autowired
    private UserRepo userRepo;
    @GetMapping(value = "/")
    private String getPage(){

        return "hey dee";
    }
    //getting a list of our users from the database

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();//gets a list of all our users
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved...";
    }
    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser=userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setOccupation(user.getOccupation());
        updatedUser.setAge(user.getAge());
        userRepo.save(updatedUser);
        return "updated";
    }

}
