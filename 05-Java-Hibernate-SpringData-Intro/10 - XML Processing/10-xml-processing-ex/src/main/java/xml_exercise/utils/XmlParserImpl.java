package xml_exercise.utils;

import org.springframework.stereotype.Component;

import javax.xml.bind.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Component
public class XmlParserImpl implements XmlParser {
    @Override
    public <T> T unmarshalFromFiles(String filePath, Class<T> tClass) throws JAXBException, FileNotFoundException {

        JAXBContext jaxbContext = JAXBContext.newInstance(tClass);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return (T) unmarshaller.unmarshal(new FileReader(filePath));
    }

    @Override
    public <T> void marshalToFile(String filePath, T rootDto) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(rootDto.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(rootDto, new File(filePath));

    }
}
