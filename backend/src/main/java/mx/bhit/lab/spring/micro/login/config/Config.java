package mx.bhit.lab.spring.micro.login.config;

/**
 * Created by ingor on 24/02/2017.
 */
@org.springframework.context.annotation.Configuration
@org.springframework.context.annotation.Import({ MongoConfig.class })
@org.springframework.boot.autoconfigure.EnableAutoConfiguration(exclude = {
    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class })
public class Config {
}
