package mx.bhit.lab.spring.micro.login.config;

import com.mongodb.Mongo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static java.util.Collections.singletonList;

/**
 * Created by ingor on 24/02/2017.
 */
@org.springframework.context.annotation.Configuration
@org.springframework.data.mongodb.repository.config.EnableMongoRepositories(basePackages = "mx.bhit.lab.spring.micro.login.domain.*")
public class MongoConfig extends org.springframework.data.mongodb.config.AbstractMongoConfiguration {

    @org.springframework.context.annotation.Bean
    public org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener validatingMongoEventListener() {
        return new org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener(
            validator());
    }

    @Bean
    public org.springframework.validation.beanvalidation.LocalValidatorFactoryBean validator() {
        return new org.springframework.validation.beanvalidation.LocalValidatorFactoryBean();
    }

    /**
     * Return the name of the database to connect to.
     *
     * @return must not be {@literal null}.
     */
    @Override
    protected String getDatabaseName() {
        return this.dbName;
    }

    /**
     * Return the {@link Mongo} instance to connect to. Annotate with {@link Bean} in case you want to expose a
     * {@link Mongo} instance to the {@link ApplicationContext}.
     *
     * @return
     * @throws Exception
     */
    @Override
    public com.mongodb.Mongo mongo() throws Exception {

        return new com.mongodb.MongoClient(singletonList(new com.mongodb.ServerAddress("localhost", 27017)),
            singletonList(com.mongodb.MongoCredential.createCredential("admin", this.getDatabaseName(),
                "t00r".toCharArray())));
    }

    //@Value("${mongodb.name}")
    private String dbName = "admin";

    //@Value("${mongodb.host}")
    //private String host;

    //@Value("${mongodb.port}")
    //private Integer port;

    //@Value("${mongodb.username}")
    //private String userName = "omicron";

    //@Value("${mongodb.password}")
    //private String password = "0micr0n";

}
