package com.hh.s1.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hh.util.DBConnector;

public class NoticeDAO {

	
	
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception {
		Connection con = DBConnector.getConnect();
		String sql="insert into notice values(board_seq,?,?,?,sysdate,0)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getWriter());
		st.setString(3, noticeDTO.getContents());
		
		int result = st.executeUpdate();
	
		return result;
	}
	
	public NoticeDTO noticeSelect(int num) throws Exception {
		
		Connection con = DBConnector.getConnect();
		String sql="select * from notice where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		ResultSet rs = st.executeQuery();
		NoticeDTO noticeDTO = null;
		if(rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
		}
		return noticeDTO;
	}
	
	public List<NoticeDTO> noticeList() throws Exception{
		
		Connection con = DBConnector.getConnect();		
		String sql = "select * from notice order by num desc";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();

		while(rs.next()) {
			
	         NoticeDTO noticeDTO = new NoticeDTO();
	         noticeDTO.setNum(rs.getInt("num"));
	         noticeDTO.setTitle(rs.getString("title"));
	         noticeDTO.setWriter(rs.getString("writer"));
	         //noticeDTO.setContents(rs.getString("contents"));
	         noticeDTO.setReg_date(rs.getDate("reg_date"));
	         noticeDTO.setHit(rs.getInt("hit"));
	         ar.add(noticeDTO);
			
		}
		rs.close();
		st.close();
		con.close();
	
		return ar;
	}
}
