import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created by panshriv on 02-02-2017.
 */
public class XMLToObject {

    public static void main(String[] args) throws JAXBException {

        String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><employee id=\"123\"><name>Pankaj</name><salary>100.0</salary></employee>";

        // Step 1 - Create the context
        JAXBContext context = JAXBContext.newInstance(Employee.class);

        // Step 2 - Create the Unmarshller from the context
        Unmarshaller unmrshler = context.createUnmarshaller();

        // Step  3 - Unmarshall the XML document
        Employee e = (Employee) unmrshler.unmarshal(new StringReader(xml));

//        System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() );

    }
}
