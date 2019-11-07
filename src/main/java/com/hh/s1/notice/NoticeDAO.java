package com.hh.s1.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Inject
	private DataSource dataSource;
	
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception {
		Connection con = dataSource.getConnection();
		String sql="insert into notice values(board_seq,?,?,?,sysdate,0)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getWriter());
		st.setString(3, noticeDTO.getContents());
		
		int result = st.executeUpdate();
	
		return result;
	}
	
	public NoticeDTO noticeSelect(int num) throws Exception {
		
		Connection con = dataSource.getConnection();
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
		
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		
		
	
		return ar;
	}
}
