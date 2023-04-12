package com.mongod.workshopmongo.resource;

import com.mongod.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity <List<User>> findAll(){
        User Joao = new User("1","João Silva", "joao@gmail.com");
        User Maria = new User("2","Maria Silva","maria@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(Joao,Maria));
        return ResponseEntity.ok().body(list);

    }
}
