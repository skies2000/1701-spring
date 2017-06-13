package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/hello") //요청 url중 /hello 경로가 표시되었을 때
	public String hello(Model model,
			@RequestParam(value = "name", required = false)
		    String name){
		
		model.addAttribute("greeting","안녕하세요 ~"+name);
		
		return "hello"; // view의 이름.
		
	} 
	
	@RequestMapping("/abc") //요청 url중 /hello 경로가 표시되었을 때
	public String abc(Model model,
			@RequestParam(value = "name", required = false)
		    String name){
		 
		model.addAttribute("greeting","안녕하세요 ~"+name);
		
		return "hello"; // view의 이름.
		
	}
}
