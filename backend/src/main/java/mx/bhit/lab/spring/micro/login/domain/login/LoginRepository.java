package mx.bhit.lab.spring.micro.login.domain.login;

/**
 * Created by ingor on 24/02/2017.
 */
public interface LoginRepository extends
    org.springframework.data.mongodb.repository.MongoRepository<Login, String> {
    Login findByUser(String user);
}
