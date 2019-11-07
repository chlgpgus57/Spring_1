package com.hh.s1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public void memberJoin() {
		
	}

	@RequestMapping(value = "memberLogin" , method = RequestMethod.GET)
	public void memberLogin() {
		
	}

	
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin2(Model model) {
		boolean flag= true;
		String msg="회원가입 실패";
		if(flag) {
			msg="회원가입 성공";
			model.addAttribute("msg", msg);
			model.addAttribute("path", "../common/common_result.jsp");
			return "redirect:../home";
		}else {
			return "redirect:../member/memberJoin";	
		}
	}

	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin2() {
		
		boolean flag= true;
		String msg="회원가입 실패";
		if(flag) {
			msg="회원가입 성공";
			
			return "redirect:../home";
		}else {
			return "redirect:../member/memberLogin";	
		}
	}
}
