package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.KingsAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ShowController {

    List<BankAccount> accounts =  new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", 2000D, "lion", false),
            new BankAccount("Pumbaa", 1000D, "warthog", false),
            new KingsAccount("Mufasa", 10000D, "lion", false),
            new BankAccount("Scar", 8500D, "lion", true),
            new BankAccount("Sarabi", 5000D, "lioness", false),
            new BankAccount("Ed", 500D, "hyena", true)));

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("acc", accounts);
        model.addAttribute("currency", "Zebra");
        return "default";
    }

    @PostMapping("/show")
    public String addAccount(@ModelAttribute BankAccount bankAccount){
        accounts.add(bankAccount);
        return "redirect:/show";
    }

    @PostMapping("/update-balance")
    public String raiseMoney(@RequestParam Integer index){
        if (accounts.get(index) instanceof KingsAccount){
            accounts.get(index).setBalance(accounts.get(index).getBalance()+100);
        } else {
            accounts.get(index).setBalance(accounts.get(index).getBalance()+10);
        }
        return "redirect:/show";
    }

}

