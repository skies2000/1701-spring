package di_anno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardDao {

	Connection conn = null;
	BoardVo dVo = null;
	public BoardDao() {
	}
	@Autowired
	public BoardDao(DBConnect dbc) {
		conn = dbc.getConn();
	}
	
	@SuppressWarnings("finally")
	public BoardVo view(BoardVo vo){
		BoardVo nVo = new BoardVo();
		ResultSet rs = null;
		PreparedStatement ps = null;
		String sql = "";
		
		
		try {
			sql = "select * from board where serial = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getSerial());
			rs = ps.executeQuery();
			if(rs.next()){
				nVo.setSerial(rs.getInt("serial"));
				nVo.setmDate(rs.getString("mdate"));
				nVo.setWorker(rs.getString("worker"));
				nVo.setSubject(rs.getString("subject"));
				nVo.setContent(rs.getString("content"));
				nVo.setHit(rs.getInt("hit"));
			}
			conn.close();
		} catch (Exception e) {
		}finally {
			dVo = nVo;
			return nVo;
		}
	}
}
