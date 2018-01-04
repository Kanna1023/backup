package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.shop.dto.BuyItemDTO;
import com.internousdev.shop.util.DBConnector;

public class BuyItemDAO {

	List<BuyItemDTO>dtoList = new ArrayList<BuyItemDTO>();

	public List<BuyItemDTO>select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select id,item_name,item_price FROM item";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				BuyItemDTO dto = new BuyItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dtoList.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtoList;
	}

}