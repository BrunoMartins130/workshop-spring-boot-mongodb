package com.mongod.workshopmongo.services;

import com.mongod.workshopmongo.domain.User;
import com.mongod.workshopmongo.dto.UserDTO;
import com.mongod.workshopmongo.repositories.UserRepository;
import com.mongod.workshopmongo.services.exception.ObjectNotFoundExeception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    public User findByid(String id){
     Optional<User> obj = repository.findById(id);
       return obj.orElseThrow(() -> new ObjectNotFoundExeception("Objeto não encontrado"));
    }
    public User insert(User obj){
        return repository.insert(obj);
    }
    public void delete(String id) {
        findByid(id);
        repository.deleteById(id);
    }
    public User update(User obj){
         User newObj = findByid(obj.getId());
         updateData(newObj , obj);
         return repository.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(),objDTO.getName(),objDTO.getEmail());

   }



}
