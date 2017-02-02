import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by panshriv on 02-02-2017.
 */

public class Family_Member {

    private String name;
    private int age;

    public Family_Member() {
    }

    public Family_Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
