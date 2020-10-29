package com.javachip.carrotcountry.shMarketBoard.townMarket.model.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import static com.javachip.carrotcountry.common.JDBCtemplate.*;

import com.javachip.carrotcountry.shMarketBoard.mainPage.model.vo.PostBoard;
import com.javachip.carrotcountry.shMarketBoard.townMarket.model.service.TownMarketService;
import com.javachip.carrotcountry.shMarketBoard.townMarket.model.vo.CategoryHY;

public class TownMarketDao {
	
	
Properties prop = new Properties();
	
	public TownMarketDao() {
		
		try {
			prop.loadFromXML(new FileInputStream(TownMarketDao.class.getResource("/sql/shMarket/shMarket.xml").getPath()));
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public ArrayList<CategoryHY> CategorySelector(Connection conn) {
		
		ArrayList<CategoryHY> list = new ArrayList();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = prop.getProperty("CategorySelector");
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CategoryHY c = new CategoryHY(rs.getString("CATEGORY_NAME"));
				
				list.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		
		return list;
	}


	public ArrayList<PostBoard> MainArticleSelector(Connection conn) {
		
		ArrayList<PostBoard> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = prop.getProperty("MainArticleSelector");
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PostBoard pb = new PostBoard(rs.getInt("POST_NO")
											,rs.getInt("MEM_NO")
											,rs.getString("LOCATION")
											,rs.getString("POST_NAME")
											,rs.getString("CATEGORY_NAME")
											,rs.getString("THUMBNAIL_PATH")
											,rs.getString("THUMBNAIL_FILENAME")
											,rs.getString("THUMBNAIL_LOADPATH")
											,rs.getInt("POST_VIEWS")
											,rs.getInt("POST_LIKES")
											,rs.getInt("PROD_PRICE"));
				list.add(pb);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		return list;
	}

}
