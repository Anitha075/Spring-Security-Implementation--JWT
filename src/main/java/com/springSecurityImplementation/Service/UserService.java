package com.springSecurityImplementation.Service;


import com.springSecurityImplementation.Repo.UserRepo;
import com.springSecurityImplementation.model.Users;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);

    public Users register(Users user)
    {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       return repo.save(user);
    }

}
