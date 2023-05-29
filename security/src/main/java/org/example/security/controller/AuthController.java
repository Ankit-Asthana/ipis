 package org.example.security.controller;

 import lombok.RequiredArgsConstructor;
 import org.example.security.model.User;
 import org.example.security.repo.UserRepository;
 import org.example.security.service.AuthenticationRequest;
 import org.example.security.service.AuthenticationResponse;
 import org.example.security.service.JwtService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.ResponseEntity;
 import org.springframework.security.core.userdetails.UserDetails;
 import org.springframework.security.core.userdetails.UserDetailsService;
 import org.springframework.web.bind.annotation.*;

 @RestController
 @RequestMapping("/api")
 @RequiredArgsConstructor
 public class AuthController {
     private final JwtService jwtService;
     private final UserRepository userRepository;
     private final UserDetailsService userDetailsService;
     private final AuthenticationResponse authenticationResponse;
     @PostMapping("/signup")
     public ResponseEntity<User> signup(@RequestBody User user) {
         return ResponseEntity.ok(userRepository.save(user));
     }

     @PostMapping("/login")
     public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
         UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
         final String jwtToken = jwtService.generateToken(userDetails);
         return ResponseEntity.ok(new AuthenticationResponse(jwtToken));
     }
 }
