package kz.bitlab.spring.bootfirstapp.controller;

import kz.bitlab.spring.bootfirstapp.DBManager.DBManager;
import kz.bitlab.spring.bootfirstapp.model.Students;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String homePage(Model model){
        ArrayList<Students> students = DBManager.getAllStudents();
        model.addAttribute("students",students);
        return "home";
    }

    @GetMapping(value = "/addstudent")
    public String addStudent(){
        return "addstudent";
    }

    @PostMapping(value = "/addstudent")
    public String addStudent(@RequestParam(name = "name") String name,
                             @RequestParam(name = "surname") String surname,
                             @RequestParam(name = "exam") int exam,
                             Model model){
        Students student = new Students();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);

        String mark = null;
        if(exam>=90){
            mark = "A";
        } else if (exam>=75 && exam<=89) {
            mark = "B";
        } else if (exam>=60 && exam<=74) {
            mark = "C";
        } else if (exam>=50 && exam<=59) {
            mark = "D";
        }else {
            mark = "F";
        }

        student.setMark(mark);

        DBManager.addStudent(student);
        return "redirect:/";
    }
}
