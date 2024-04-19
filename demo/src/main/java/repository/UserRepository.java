package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import model.user;

public class UserRepository {
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public Integer add(User user) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(user);
		String sql = " INSERT INTO stockapi.users ( ACCOUNT, NAME, PASSWORD ) "
				   + " VALUE ( :account, :name, :password ) " ;
		namedParameterJdbcTemplate.update(sql, sqlParameterSource,keyHolder);
		return keyHolder.getKey().intValue();
	}
}
