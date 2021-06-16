package com.feastival.project.controller;

import com.feastival.project.model.Member;
import com.feastival.project.model.TestModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class loginController {

    @RequestMapping(method = RequestMethod.POST, path = "/form")
    public Member postRequest(@RequestBody Member member) {

        return ;
    }
}