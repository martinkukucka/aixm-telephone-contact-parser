import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class TelephoneContactParser extends DefaultHandler {

    private StringBuilder elementValue = new StringBuilder();
    private boolean inTelephoneContact = false;
    private boolean inElement = false;
    private ConfigLoader configLoader;
    private static final String nillable = "xsi:nil";

    // function loads elements from config file at the beginning of parsing process
    @Override
    public void startDocument() {
        configLoader = new ConfigLoader();
        try {
            configLoader.loadElements();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // function stores value of telephone contact to variable elementValue
    @Override
    public void characters(char[] ch, int start, int length) {
        if(inTelephoneContact && inElement){
            elementValue.append(ch, start, length);
        }
    }

    /* function invokes to start parsing process when one of the child elements (non-nillable) has been found inside of
       root element tag */
    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) {
        if(inTelephoneContact){
            if(configLoader.getChildElements().contains(qName)){
                if(!(attr.getValue(nillable) != null && attr.getValue(nillable).equals("true"))){
                    inElement = true;
                    elementValue = new StringBuilder();
                }
            }
        }

        if(qName.equals(configLoader.getRootElement()) ) {
            inTelephoneContact = true;
        }
    }

    // function prints telephone contact when parsing process ends for one of the child elements loaded from config file
    @Override
    public void endElement(String uri, String localName, String qName) {
        if(qName.equals(configLoader.getRootElement())) {
                inTelephoneContact = false;
        }

        if(inTelephoneContact && inElement && (configLoader.getChildElements().contains(qName))){
            inElement = false;
            System.out.println(elementValue.toString());
        }
    }
}