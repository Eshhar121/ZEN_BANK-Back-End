package edu.icet.controller;

import edu.icet.dto.User;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService userService;

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getAll();
    }

    @PostMapping("/add-user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/update-user")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("delete-user/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUser(@PathVariable String id){
        userService.deleteUserById(id);
    }

    @GetMapping("/search-user/{idOrName}")
    public List<User> searchUserByIdOrName(@PathVariable String idOrName){
        return userService.searchUserByIdOrName(idOrName);
    }
}
