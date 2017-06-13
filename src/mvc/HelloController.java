package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/hello") //요청 url중 /hello 경로가 표시되었을 때
	public String eee(Model model,//어노테이션 경로에 해당하는것이 들어오면 메소드를 실행 메소드명은 아무거나 해도 상관이 없다.
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
