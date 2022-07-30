import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ConfigLoader {

    private static final String configFilePath = "./config/config.txt";

    private String rootElement;
    private ArrayList<String> childElements;

    public String getRootElement() {
        return rootElement;
    }

    public void setRootElement(String rootElement) {
        this.rootElement = rootElement;
    }

    public ArrayList<String> getChildElements() {
        return childElements;
    }

    /* function loads root (parent) element to variable rootElement
       and child elements to childElements ArrayList if they exist,
       otherwise throw exception
     */
    public void loadElements() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(configFilePath))) {
            String line;
            childElements = new ArrayList<>();

            if((line = br.readLine()) != null){
                setRootElement(line);
            }

            while ((line = br.readLine()) != null) {
                childElements.add(line);
            }

            if (rootElement == null || childElements.isEmpty()) {
                throw new Exception("Missing contents of configuration file");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}