package homework_1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

public class XmlTransformer_1 {

    public void createXml(Humans humans) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Humans.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.marshal(humans, new FileOutputStream("humans.xml"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    public Object createHumans(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Humans.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new File(xml));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
