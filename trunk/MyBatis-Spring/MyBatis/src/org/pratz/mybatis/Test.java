package org.pratz.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.pratz.mybatis.client.UsersMapper;
import org.pratz.mybatis.model.Users;

public class Test {
	public static void main(String args[]) throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		Users user = mapper.selectByPrimaryKey("user1");
		System.out.println(user.getPassword());
		session.close();
	}

}
