package com.example.Crudrapido.controller;

import com.example.Crudrapido.security.JWTAuthorizationFilter;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class OAuthController {
    @GetMapping
    public String Authorization (){
        return "Auth";
    }
}
