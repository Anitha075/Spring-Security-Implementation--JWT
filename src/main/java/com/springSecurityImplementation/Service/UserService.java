package com.springSecurityImplementation.Service;


import com.springSecurityImplementation.Repo.UserRepo;
import com.springSecurityImplementation.model.Users;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private JWTService service;

    @Autowired
    AuthenticationManager authenticationManager;


    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);

    public Users register(Users user)
    {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       return repo.save(user);
    }

    public String verify(Users user) {
        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated())
        {
            return service.generateToken(user.getUsername());
        }

        return "failed";
    }
}
