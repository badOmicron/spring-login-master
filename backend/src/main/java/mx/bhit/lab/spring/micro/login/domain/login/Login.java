package mx.bhit.lab.spring.micro.login.domain.login;

import mx.bhit.lab.spring.micro.login.domain.AbstractModel;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ingor on 24/02/2017.
 */
@Document(collection = "omicron_blog")
public class Login extends AbstractModel {

    /**
     *
     */
    private static final long serialVersionUID = -3271052480389480504L;
    private String user;
    private String pwd;

    public Login(String user, String pwd) {
        super();
        this.user = user;
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pass) {
        this.pwd = pass;
    }

}
