package com.gopersist.demo.mybatis.controller;

import com.gopersist.demo.mybatis.entity.User;
import com.gopersist.demo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        User user = this.userService.findOne(id);
        return user;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        user.setId(null);
        if (this.userService.create(user)) {
            return user;
        } else {
            return null;
        }
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        if (this.userService.update(user)) {
            return user;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        if (this.userService.delete(id)) {
            return "Deleted";
        } else {
            return "Delete failed";
        }
    }
}
