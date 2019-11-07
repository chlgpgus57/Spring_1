package com.hh.s1.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public class NoticeService {
	
	@Inject
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		
		this.noticeDAO = new NoticeDAO();
		
	}
	
	
	public List<NoticeDTO> noticeList() throws Exception{
		
		List<NoticeDTO> ar= noticeDAO.noticeList();
		
		return ar;
	}
	
	public NoticeDTO noticeSelect(int num) throws Exception{
		

		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		
		return noticeDTO;	
	}
	
	public void noticeWrite(NoticeDTO noticeDTO) throws Exception{
		
		noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("title");
		noticeDTO.setWriter("writer");
		noticeDTO.setContents("contents");
		
		int result = noticeDAO.noticeWrite(noticeDTO);

		String msg="등록실패";
		if(result>0) {
			msg="등록성공";
				
			ModelAndView mv = new ModelAndView();
			mv.addObject("msg", msg);
			mv.addObject("path", "noticeList");

		}else {
		
		}
		
		
		
	}
	
}
