package ru.yakimov.DataMapper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.yakimov.DataMapper.servises.StudentService;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Controller
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @GetMapping
    public String list(Model model){
        model.addAttribute("studentList", studentService.findAll());
        return "index";
    }


}
