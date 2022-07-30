import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileNotFoundException;

public class AIXMParser {

    public static void main(String[] args) throws Exception {
        // check if argument (path to input file) was entered
        if (args.length != 1) {
            throw new IllegalArgumentException("Missing argument: input file");
        }

        try {
            // create instance of SAX parser
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            // parse input file (args[0] - input file)
            saxParser.parse(args[0], new TelephoneContactParser());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}