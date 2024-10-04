package com.departmentalstore.store.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.departmentalstore.store.bean.User;
import com.departmentalstore.store.service.UserService;
import com.departmentalstore.store.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  private UserService userService;

  @Autowired
  private JwtUtil jwtUtil;
  
  @Autowired
  private PasswordEncoder passwordEncoder;

  @PostMapping("/register")
  public ResponseEntity<User> registerUser(@RequestBody User user) {
    User registeredUser = userService.registerUser(user);
    return ResponseEntity.ok(registeredUser);
  }

  @PostMapping("/login")
  public ResponseEntity<String> login(@RequestBody User user) {
    User foundUser = userService.findByEmail(user.getEmail());
    if (foundUser != null && passwordEncoder.matches(user.getPassword(), foundUser.getPassword())) {
      String token = jwtUtil.generateToken(foundUser.getUsername());
      return ResponseEntity.ok(token);
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
  }
  
  
  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
      User user = userService.getUserById(id);
      if (user != null) {
          return ResponseEntity.ok(user);
      } else {
          return ResponseEntity.notFound().build(); // Return 404 if user is not found
      }
  }

  @GetMapping("/getallusers")
  public ResponseEntity<List<User>> getAllUsers() {
      List<User> users = userService.getAllUsers();
      if (users.isEmpty()) {
          return ResponseEntity.noContent().build(); // Return 204 if no users are found
      } else {
          return ResponseEntity.ok(users); // Return 200 with the list of users
      }
  }
}