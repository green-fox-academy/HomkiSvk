package com.greenfoxacademy.day2di.greenfoxClassApp.controllers;

import com.greenfoxacademy.day2di.greenfoxClassApp.services.DataFactory;
import com.greenfoxacademy.day2di.greenfoxClassApp.services.DataGetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeGFAController {

    private final DataGetting service;

    @Autowired
    public HomeGFAController() {
        this.service = DataFactory.createData();
    }

    @GetMapping("/gfa")
    public String home(Model model){
        model.addAttribute("studentCount", service.count());
        return "indexGFA";
    }

    @GetMapping("/gfa/list")
    public String homeList(Model model){
        model.addAttribute("names", service.findAll());
        return "indexGFA";
    }

    @GetMapping("/gfa/add")
    public String addStudent(Model model) {
        model.addAttribute("addStudent", true);
        model.addAttribute("names", service.findAll());
        return "indexGFA";
    }

    @PostMapping("/gfa/save")
    public String saveStudent(@RequestParam String name) {
        service.save(name);
        return "redirect:/gfa/add";
    }

    @GetMapping("/gfa/check")
    public String checkStudentForm(Model model) {
        model.addAttribute("checkStudent", true);
        model.addAttribute("names", service.findAll());
        return "indexGFA";
    }

    @PostMapping("/gfa/check")
    public String checkStudentResult(Model model, @RequestParam String name) {
        model.addAttribute("checkStudent", true);
        model.addAttribute("names", service.findAll());
        model.addAttribute("name", name);
        model.addAttribute("isThere", service.findAll().contains(name));
        return "indexGFA";
    }

    @GetMapping("/gfa/saveFile")
    public String saveToFile(){
        service.newFile();
        return "redirect:/gfa";
    }



}
