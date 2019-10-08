package com.ngBoot.userportal.user.controller;

import com.ngBoot.userportal.user.repository.User;
import com.ngBoot.userportal.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})
@RequestMapping({"/users"})
public class UserController {

    @Autowired
    private UserService userService;

    // 검색 단일&리스트&키워드검색
    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        System.out.println(" id : " + id);
        return userService.findById(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping(path = {"/search"})
    public List<User> Search(@RequestParam(value = "term")  String term){
        System.out.println(" term : " + term);
        return userService.findByName(term);
    }

    // http 메서드 별 수행
    @PutMapping(path = {"/{id}"})
    public User update(@PathVariable("id") int id, @RequestBody User user){
        System.out.println("user updated : " + user);
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        System.out.println("user delete");
        return userService.delete(id);
    }


    @PostMapping
    public User create(@RequestBody User user){
        System.out.println("user Created");
        return userService.create(user);
    }

}
