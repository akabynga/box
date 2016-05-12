package com.emailsender.platform.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.emailsender.platform.dao.StudentDao;
import com.emailsender.platform.model.Student;

@Repository
public class JdbcTemplateStudentDaoImpl implements StudentDao {

	private static final String FindAll = "SELECT * FROM Student";
	private static final String FindById = "SELECT * FROM Student WHERE id = ?";
	private static final String Update = "UPDATE Student ET firstName = ?, lastName = ?, email = ? WHERE id = ?";
	private static final String Delete = "DELETE FROM Student WHERE id= ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Long create(Student entity) {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		jdbcInsert.withTableName("Student").usingGeneratedKeyColumns("id");

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("firstName", entity.getFirstName());
		parameters.put("lastName", entity.getLastName());
		parameters.put("email", entity.getEmail());

		Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
		return ((Number) key).longValue();
	}

	public List<Student> findAll() {
		return jdbcTemplate.query(FindAll, new BeanPropertyRowMapper<Student>(Student.class));
	}

	public Student findById(Long entityId) {
		return (Student) jdbcTemplate.queryForObject(FindById, new Object[] { entityId },
				new BeanPropertyRowMapper<Student>(Student.class));
	}

	public Integer update(Student entity) {
		return jdbcTemplate.update(Update, entity.getFirstName(), entity.getLastName(), entity.getEmail());
	}

	public Integer delete(Long entityId) {
		return jdbcTemplate.update(Delete, entityId);
	}

}
