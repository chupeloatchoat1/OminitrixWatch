package controller;

import entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AccountService;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "/all")
    public String tezt(){
//        List<Account> lst = accountService.findAll();
//        return lst;
        String ca ="c";
        return ca;
    }
}
