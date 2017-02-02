/**
 * Created by panshriv on 02-02-2017.
 */

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = { "name", "salary", "addr","family"})
public class Employee {

    public Employee() {
    }


    private int id;
    private String name;
    private Double salary;
    private Addr addr;
    private List<Family_Member> family;

    public Employee(int id, String name, Double salary, Addr addr) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addr = addr;

        Family_Member mom = new Family_Member("mom",50);
        Family_Member dad = new Family_Member("dad",60);
        Family_Member sis = new Family_Member("sis",20);

        family = new ArrayList();
        family.add(mom);
        family.add(dad);
        family.add(sis);
    }


    @XmlAttribute
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @XmlElement
    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    @XmlElementWrapper(name="family") // Name for the collection
    @XmlElement(name="familyMember") // Name for each member of the collection
    public List<Family_Member> getFamily() {
        return family;
    }

    public void setFamily(List<Family_Member> family) {
        this.family = family;
    }
}
