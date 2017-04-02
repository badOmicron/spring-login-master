package mx.bhit.lab.spring.micro.login.controller;

import mx.bhit.lab.spring.micro.login.domain.login.Login;
import mx.bhit.lab.spring.micro.login.domain.login.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by ingor on 24/02/2017.
 */
@RestController
public class LoginController {
    private LoginRepository loginRepo;

    @Autowired
    public LoginController(LoginRepository loginRepo) {
        this.loginRepo = loginRepo;
    }

    @PostConstruct
    public void initData() {
        System.out.println("initData");
        // taskRepo.deleteAll();
        loginRepo.save(new Login("oramos", "1234"));
        loginRepo.save(new Login("dasdas", "SERCRETO"));
        loginRepo.save(new Login("fperez", "asdasf"));
    }

    @RequestMapping(value = "/login")
    public java.util.List<Login> getAllTasks() {
        System.out.println("getAllTasks");
        return loginRepo.findAll();
    }

}
