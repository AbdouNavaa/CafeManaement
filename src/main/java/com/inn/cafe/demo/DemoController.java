package com.inn.cafe.demo;

import com.inn.cafe.auth.AuthenticationResponse;
import com.inn.cafe.auth.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secured endpoint.");
    }
}
// @GetMapping(path = "/get")
//    public ResponseEntity<List<UserWrapper>> getAllUser();