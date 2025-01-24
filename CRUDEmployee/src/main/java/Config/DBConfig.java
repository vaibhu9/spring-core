package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"service","repository"})
public class DBConfig {
    
    @Bean(name="dataSource")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/EmployeeDatabase");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean(name="template")
    public JdbcTemplate getTemplate(){
        JdbcTemplate template=new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

}
