package spring.boot.DataBaseConnection;

import java.sql.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


@Component("noticesDao")

public class NoticesDAO {

	
	private JdbcTemplate  jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc){
		this.jdbc = new JdbcTemplate(jdbc);
		
	}
	
	public List<Notice>getNotices(){
		
	return	 jdbc.query("select * from notices", new RowMapper<Notice>(){

			@Override
			public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notice notice = new Notice();
				
				notice.setId(rs.getInt("Id"));
				notice.setName(rs.getString("name"));
				notice.setEmail(rs.getString("email"));
				notice.setText(rs.getString("text"));
				
				
				return notice;
			}
			
		});
	
	}
}
