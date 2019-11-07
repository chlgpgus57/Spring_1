package com.hh.s1;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hh.s1.notice.NoticeDTO;
import com.hh.s1.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Inject
	private NoticeService noticeService ;
	
	
	
	/*
	 * public NoticeController() { 
	 * 	noticeService = new NoticeService(); 
	 * }
	 */
	
	
	//write중에서 post방식
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public String noticeWrite(NoticeDTO noticeDTO) throws Exception {

		noticeService.noticeWrite(noticeDTO);
		
		return "redirect:./noticeList";
	}
	
	//write중에서 get방식인애들만
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET )
	public String noticeWrite() {
		return "notice/noticeWrite";
	}
	
	//selectOne
	@RequestMapping(value = "noticeSelect" , method = {RequestMethod.GET , RequestMethod.POST}, params = {"num=1, name=iu, age"})
	public void noticeSelect(Model model,  @RequestParam(value="num", required = true, defaultValue = "1") int num) throws Exception {
		
		NoticeDTO noticeDTO = noticeService.noticeSelect(num);
		
		model.addAttribute("noticeDTO", noticeDTO);
		
		/*
		 * System.out.println(num); String data= "Notice Data";
		 * model.addAttribute("data",data);
		 */
	}
	
	//list
	@RequestMapping("noticeList")//경로 : 절대경로로 적어줘야함.
	public ModelAndView noticeList() throws Exception {
	
		
		List<NoticeDTO> ar = noticeService.noticeList();
		
		//URL notice/noticeList
		//return notice/noticeList
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
	}
	
}
