import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class ObjectToXML {

    public static void main(String[] args) throws JAXBException {
        JAXBContext contextObj = null;

        System.out.println(" -- Starting the conversion --");

        // Step 1 - Create the POJO
        Employee e = new Employee(123, "Pankaj", 100.0, new Addr("420","church street"));


        // Step 2 - Create the JAXBContext Object - One context for each Class
            contextObj = JAXBContext.newInstance(Employee.class);;

        // Step 3 - Create the Marshaller Object from the Context Object
        Marshaller marshaller = contextObj.createMarshaller();

        StringWriter w = new StringWriter();
        // Step 4 - Call the Marshal method to create the XML.
        marshaller.marshal(e,w);
        System.out.println(w);
    }
}
