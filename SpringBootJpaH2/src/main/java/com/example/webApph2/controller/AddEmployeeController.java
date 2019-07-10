package com.example.webApph2.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.webApph2.entity.EmployeeEntity;
import com.example.webApph2.repo.EmployeeEntityRepo;

@Controller
public class AddEmployeeController {

	@Autowired
	private EmployeeEntityRepo repo;

	@RequestMapping("/addEmployee")

	// public ResponseEntity<String> addEmployee(EmployeeEntity entity){
	public String addEmployee(EmployeeEntity employeeEntityity) {

		System.out.println(employeeEntityity);
		repo.save(employeeEntityity);

		/* return new ResponseEntity<String>("Success",HttpStatus.OK); */
		return "success";
	}

	@RequestMapping("/getEmployee")

	public ModelAndView getEmployee(@RequestParam(name = "employeeId", required = true) int employeeId) {

		ModelAndView mv = new ModelAndView("getEmployee");
		//mv.setViewName("getEmployee");
		System.out.println(employeeId);
		EmployeeEntity employeeEntityity = repo.findById(employeeId).orElse(null);
		System.out.println(employeeEntityity);
		mv.addObject(employeeEntityity);
		System.out.println(mv);
		return mv;
	}
}
