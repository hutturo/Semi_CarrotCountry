package com.javachip.carrotcountry.adminBoard.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.javachip.carrotcountry.adminBoard.model.vo.AdminMember;
import com.javachip.carrotcountry.adminBoard.model.vo.AdminPageInfo;

import static com.javachip.carrotcountry.common.JDBCtemplate.*;

public class AdminMemberDao {
	
	private Properties prop = new Properties();
	
	public AdminMemberDao() {
		
		String fileName = AdminMemberDao.class.getResource("/sql/adminBoard/adminMember-mapper.xml").getPath();
		
		try {
			prop.loadFromXML(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public ArrayList<AdminMember> userSelectAll(Connection conn, AdminPageInfo pi) {

		ArrayList<AdminMember> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("userSelectAll");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			int startRow = (pi.getCurrentPage() -1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				AdminMember am = new AdminMember();
				
				am.setMemNo(rset.getInt("mem_no"));
				am.setMemUserId(rset.getString("mem_userid"));
				am.setMemName(rset.getString("mem_name"));
				am.setMemBirthday(rset.getString("mem_birthday"));
				am.setMemPhone(rset.getString("mem_phone"));
				am.setMemEmail(rset.getString("mem_email"));
				am.setMemEnrollDate(rset.getDate("mem_enroll_date"));
				am.setbListCheck(rset.getString("b_list_check"));
				
				list.add(am);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
	public int blackListEnroll(Connection conn, String memNo, String bList) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("blackListEnroll");
		
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bList);
			pstmt.setString(2, memNo);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public ArrayList<AdminMember> blackListSelectAll(Connection conn, AdminPageInfo pi) {

		ArrayList<AdminMember> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("blackListSelectAll");
		
		try {
			pstmt = conn.prepareStatement(sql);

			int startRow = (pi.getCurrentPage() -1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;

			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				AdminMember am = new AdminMember();

				am.setMemNo(rset.getInt("mem_no"));
				am.setMemName(rset.getString("mem_name"));
				am.setMemUserId(rset.getString("mem_userid"));
				am.setMemPhone(rset.getString("mem_phone"));
				am.setMemEmail(rset.getString("mem_email"));
				am.setReportCount(rset.getInt("report_count"));

				list.add(am);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public ArrayList<AdminMember> userSearchList(Connection conn, AdminPageInfo pi, String category, String search) {
		
		ArrayList<AdminMember> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("userSearchList");
		
		try {
			pstmt = conn.prepareStatement(sql);

			int startRow = (pi.getCurrentPage() -1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setString(1, "mem_name".equals(category) ? search : "");
			pstmt.setString(2, "mem_userid".equals(category) ? search : "");
			pstmt.setString(3, "mem_birthday".equals(category) ? search : "");
			pstmt.setString(4, "mem_phone".equals(category) ? search : "");
			pstmt.setInt(5, startRow);
			pstmt.setInt(6, endRow);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				AdminMember am = new AdminMember();
				
				am.setMemNo(rset.getInt("mem_no"));
				am.setMemUserId(rset.getString("mem_userid"));
				am.setMemName(rset.getString("mem_name"));
				am.setMemBirthday(rset.getString("mem_birthday"));
				am.setMemPhone(rset.getString("mem_phone"));
				am.setMemEmail(rset.getString("mem_email"));
				am.setMemEnrollDate(rset.getDate("mem_enroll_date"));
				am.setbListCheck(rset.getString("b_list_check"));
				
				list.add(am);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public ArrayList<AdminMember> blackListSearch(Connection conn, AdminPageInfo pi, String category, String search) {
		
		ArrayList<AdminMember> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("blackListSearch");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			int startRow = (pi.getCurrentPage() -1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setString(1, "mem_name".equals(category) ? search : "");
			pstmt.setString(2, "mem_userid".equals(category) ? search : "");
			pstmt.setInt(3, startRow);
			pstmt.setInt(4, endRow);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				AdminMember am = new AdminMember();

				am.setMemNo(rset.getInt("mem_no"));
				am.setMemName(rset.getString("mem_name"));
				am.setMemUserId(rset.getString("mem_userid"));
				am.setMemPhone(rset.getString("mem_phone"));
				am.setMemEmail(rset.getString("mem_email"));
				am.setReportCount(rset.getInt("report_count"));

				list.add(am);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

}
