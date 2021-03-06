package com.design.pattern.behavior.template.callback;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 用户信息
 *
 * @author chenpeng
 */
public class UserService {

    private JdbcTemplate jdbcTemplate;

    /**
     * 查询用户信息
     * @return 用户信息
     */
    public List<User> queryUser(Long id) {
        String sql = "select * from user where id=" + id;

//        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
//        List<User> query = jdbcTemplate.query(sql, rowMapper, id);

        // JDBC回调函数
        List<User> query = jdbcTemplate.query(sql, new UserRowMapper());
        return query;
    }
}
