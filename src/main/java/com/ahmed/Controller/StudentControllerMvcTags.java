package com.ahmed.Controller;

public class StudentControllerMvcTags {
	package com.spring.studentcontrol;


	import org.springframework.beans.propertyeditors.StringTrimmerEditor;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.WebDataBinder;
	import org.springframework.web.bind.annotation.InitBinder;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;

	import com.spring.model.Student;

	import javax.validation.Valid;


	//http://localhost:9090/spring-mvc/student-mvc-tags

	@Controller
	@RequestMapping("/student-mvc-tags")
	public class StudentControllerMvcTags {
		
		
		// http://localhost:9090/spring-mvc/student-mvc-tags/account-Mvc-tags
		@RequestMapping("/account-Mvc-tags")
		public String StudentFormMvcTags(Model model) {
			Student student = new Student();
			model.addAttribute("student",student);
			return "student-front-mvc-tags/student-account";
		}
		
		
		@RequestMapping("/processmvctags")
		public String ShowInfo(@Valid @ModelAttribute("student") Student student,
							   BindingResult bindingResult) {
			System.out.println(bindingResult);
			if(bindingResult.hasErrors()) {
				return "student-front-mvc-tags/student-account";
			} else {
				return "student-front-mvc-tags/showdatastudent";
			}
			
		}
		
		@InitBinder
		public void initBinder(WebDataBinder binder) {
			StringTrimmerEditor editor = new StringTrimmerEditor(true);
			binder.registerCustomEditor(String.class, editor);
		}
	}














}
