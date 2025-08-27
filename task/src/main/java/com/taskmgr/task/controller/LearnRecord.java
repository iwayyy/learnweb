package com.taskmgr.task.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.taskmgr.task.entity.LearnEntity;
import com.taskmgr.task.repository.LearnRepository; // ← 追加


@Controller
public class LearnRecord {

    private final LearnRepository learnRepository;

    public LearnRecord(LearnRepository learnRepository){
        this.learnRepository = learnRepository;
    }

    @GetMapping("/learn")
    String index(Model model){
        model.addAttribute("time",LocalDate.now());
        model.addAttribute("cont", "");
        return "index";
    } 

    @PostMapping("/learn")
    String save(@ModelAttribute LearnEntity learnEntity, Model model){
        learnRepository.save(learnEntity);
        model.addAttribute("time", LocalDate.now());
        model.addAttribute("cont", "");
        return "index";
    } 
}
