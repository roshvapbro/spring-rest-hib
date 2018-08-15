package com.candid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.candid.entity.Login;
import com.candid.entity.Student;
import com.candid.services.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView("register");
	    mav.addObject("student", new Student());
	    return mav;

	}
		
	@RequestMapping(value="/registerProcess",method=RequestMethod.POST)
	public ModelAndView createStudent(@ModelAttribute("student") Student student) {
		
		ModelAndView md=new ModelAndView("welcome");
		studentService.saveOrUpdate(student);
		md.addObject("student",student);
		return md;
		
		
		
	}
	
	@RequestMapping(value="/loginProcess",method=RequestMethod.POST)
	public ModelAndView studentLogin(@ModelAttribute("login") Login login) {
		
		ModelAndView mv=new ModelAndView("login");
		//studentService.saveOrUpdate(student);
		return mv;
		
		
		
	}
	
	  @RequestMapping(value = "/studentslist", method = RequestMethod.GET)
	    public ModelAndView listEmployees() {
	 
		  ModelAndView model = new ModelAndView("allstudents");
	        List<Student> students = studentService.findAll();
	        model.addObject("title", "titles");
	        model.addObject("students", students);
	        //model.addAttribute("students", students);
	        //System.out.println(students.size());
	        
	        return model;
	    }
}
