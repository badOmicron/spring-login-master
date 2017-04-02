package mx.bhit.lab.spring.micro.login.domain;

/**
 * Super class for all entity classes. Created by ingor on 24/02/2017.
 */
@org.springframework.data.mongodb.core.mapping.Document
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractModel implements java.io.Serializable {

    private static final long serialVersionUID = 5220928543097908450L;
    // id will be used for storing MongoDB _id
    @org.springframework.data.annotation.Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return (id == null) ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractModel other = (AbstractModel) obj;
        if (id == null)
            return other.id == null;
        return id.equals(other.id);
    }

}
