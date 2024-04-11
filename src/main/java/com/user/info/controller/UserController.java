package com.user.info.controller;

import com.user.info.dto.UserDetails;
import com.user.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userDetail")
    public ResponseEntity<UserDetails> getUserDetails(@RequestParam String user) {
        UserDetails userDetails = userService.getUserDetails(user);
        return ObjectUtils.isEmpty(userDetails) ? ResponseEntity.status(HttpStatus.NOT_FOUND).body(new UserDetails(null, null, "404", "user not found")) : ResponseEntity.ok(userDetails);
    }
}


