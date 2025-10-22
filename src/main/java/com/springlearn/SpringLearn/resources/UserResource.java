package com.springlearn.SpringLearn.resources;


import com.springlearn.SpringLearn.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getUser() {
        User user = new User(1L,"daniel","doodaniel","88999805104","Senha");
        return ResponseEntity.ok().body(user);

    }

}
