import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by panshriv on 02-02-2017.
 */

@XmlRootElement
public class Addr {

    private String houseno;
    private String street;

    public Addr() {
    }

    public Addr(String houseno, String street) {
        this.houseno = houseno;
        this.street = street;
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private String space = " ";
    @Override
    public String toString() {
        return this.houseno + space + this.street + space ;
    }
}
