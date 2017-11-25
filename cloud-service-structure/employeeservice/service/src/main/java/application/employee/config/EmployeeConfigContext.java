package application.employee.config;

import application.employee.api.EmployeeServiceInterface;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import platform.config.RestConfigContext;
import platform.persistence.mongo.MongoConfigContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017-11-18.
 */
@Configuration
@EnableMongoRepositories({"application.employee.model"})
@ComponentScan({"application.employee"})
@Import({MongoConfigContext.class,  RestConfigContext.class})
@PropertySource({"classpath:employee-service.properties"})
public class EmployeeConfigContext {

    @Autowired
    private JAXRSServerFactoryBean jaxrsServerFactoryBean;

    @Autowired
    private EmployeeServiceInterface employeeService;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocalOverride(true);

        return configurer;
    }

    @Bean
    public Server server() {
        List<Object> endpoints = new ArrayList<Object>();
        endpoints.add(employeeService);
        jaxrsServerFactoryBean.setServiceBean(endpoints);
        return jaxrsServerFactoryBean.create();
    }

}
