package com.inn.cafe.auth;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    final AuthenticationService service;
@PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
    return ResponseEntity.ok(service.register(request));
}
@PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request){
    return ResponseEntity.ok(service.authenticate(request));

}


//    @Autowired
//    UserService userService;
//    @Override
//    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
//        try{
//            return userService.signUp(requestMap);
//        }catch (Exception e){e.printStackTrace();}
//        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @Override
//    public ResponseEntity<String> login(Map<String, String> requestMap) {
//        try{
//            return userService.login(requestMap);
//        }catch (Exception ex){ex.printStackTrace();}
//        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
//    }

}
