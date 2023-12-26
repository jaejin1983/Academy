package com.spring.member.member.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.member.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}
	
	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
	
	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		System.out.println(memberVO.getId());
		int result = sqlSession.update("mapper.member.updateMember", memberVO);
		System.out.println(result);
		return result;
	}

	@Override
	public MemberVO selectMemberById(String id) {
		MemberVO result = (MemberVO) sqlSession.selectOne("mapper.member.selectMemberById", id);
		System.out.println(result);
		return result;
	}
	
	@Override
	public MemberVO loginById(MemberVO memberVO) {
		MemberVO vo = sqlSession.selectOne("mapper.member.loginById", memberVO);
		System.out.println(vo);
		return vo;
	}
	
	
	
/*
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List selectAllMembers() throws DataAccessException {
		String query = "select id, pwd, name, email, joinDate"
						+ " from t_member "
						+ " order by joinDate desc";
		List membersList = new ArrayList();
		membersList = this.jdbcTemplate.query(query, new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberVO memberVO = new MemberVO();
				memberVO.setId(rs.getString("id"));
				memberVO.setPwd(rs.getString("pwd"));
				memberVO.setName(rs.getString("name"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setJoinDate(rs.getDate("joinDate"));
				return memberVO;
			}
		});
		return membersList;
	}
	

	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		String email = memberVO.getEmail();
		String query = "insert into t_member(id, pwd, name, email) values ("
					+ "'" + id + "' ,"
					+ "'" + pwd + "' ,"
					+ "'" + name + "' ,"
					+ "'" + email + "') ";
		System.out.println(query);
		int result = jdbcTemplate.update(query);
		
		System.out.println(result);
		return result;
	}
*/

	
	
	/*
	 public MemberVO findMember(String _id) {
	    	MemberVO memInfo =null;
	    	try {
	    		con = dataFactory.getConnection();
	    		String query = "select * from t_member where id=?";
	    		pstmt = con.prepareStatement(query);
				pstmt.setString(1, _id);
				System.out.println(query);
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				
				String id = memberVO.getId();
				String pwd = memberVO.getPwd();
				String name = memberVO.getName();
				String email = memberVO.getEmail();
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				memInfo =new MemberVO(id, pwd,name, email, joinDate);
				pstmt.close();
				con.close();
	    	} catch (Exception e) {
				e.printStackTrace();
			}
	    	return memInfo;
	    }
	 
	    public void modMember(MemberVO memberVO) {
	    	String id = memberVO.getId();
	    	String pwd = memberVO.getPwd();
	    	String name = memberVO.getName();
	    	String email = memberVO.getEmail();
	    	try {
	    		con = dataFactory.getConnection();
	    		String query = "update t_member set pwd=?, name=?,email=?  where id=?";
	    		System.out.println("========================" + query);
	    		pstmt = con.prepareStatement(query);
				pstmt.setString(1, pwd);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				pstmt.setString(4, id);
				pstmt.executeUpdate();
	    		pstmt.close();
	    		con.close();
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	    */
	
	/*
	public void delMember(String id) { 
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		String email = memberVO.getEmail();
		String query = "delete from t_member" + " where id = ?";
		System.out.println("PreparedStatement: " + query); }
	*/
	
}
