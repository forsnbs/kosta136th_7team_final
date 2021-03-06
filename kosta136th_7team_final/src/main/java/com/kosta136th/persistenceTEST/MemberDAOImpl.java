package com.kosta136th.persistenceTEST;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kosta136th.domainTEST.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.kosta136th.mapper.MemberMapper";

	@Override
	public String getTime() {
	
		return sqlSession.selectOne(namespace + ".getTime");
		
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		sqlSession.insert(namespace + ".insertMember", vo);
		
	}
	
	
	
}
