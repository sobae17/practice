package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
// 스프링 부트의 컨트롤러 애너테이션
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String index () {
		//System.out.println("index");
		return "index";
		// 응답으로 'index'라는 문자열을 브라우저에 출력하기 위해 index메서드의 리턴 자료형을 String으로 변경하고 문자열 'index'를 리턴했다.
		// 여기서 @ResponseBody 애너테이션은 URL요청에 대한 응답으로 문자열을 리턴하라는 의미로 쓰였다.
	}
	
}
