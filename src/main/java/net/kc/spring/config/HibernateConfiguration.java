package net.kc.spring.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by keshav.chaure on 6/7/2018.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({"net.kc.spring.config"})
@PropertySource(value = {"classpath:application.properties"})
public class HibernateConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public LocalSessionFactoryBean sessionFactiory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[]{"net.kc.spring.model"});
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;

    }

    private Properties hibernateProperties() {
        Properties property = new Properties();
        property.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        property.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        property.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        return property;

    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
// sybage,syntel,inotix,principle global,
//* capgmeni,congni, tcs, virtuasa
        // 70 % core java + project
        //spring + rest 25%
        //hibernate 5%
        return dataSource;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory);
        return hibernateTransactionManager;
    }


}
