package histogram.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class HistogramConfigurationLoader {
    public final static List<Character> WHITE_SPACES = Arrays.asList(
            '\n', '\t', '\r', ' ');


    public HistogramConfiguration loadProperties(String propertyFileName) {
            HistogramConfiguration histogramConfiguration = new HistogramConfiguration();
            InputStream inputstream;
            Set<Character> characters = new HashSet<Character>();
            boolean whiteSpaces;

        try{
            Properties properties = new Properties();
            inputstream = getClass().getClassLoader().getResourceAsStream(propertyFileName);


            System.out.println(inputstream);
            if(inputstream != null) {
                properties.load(inputstream);
            }else throw new FileNotFoundException("property file not found");

            if(properties.getProperty("histogram.ignore.white-spaces").equals("true")) {
                whiteSpaces = true;
            }
            else {
                whiteSpaces = false;
            }

            char[] property = properties.getProperty("histogram.ignore.characters").toCharArray();
            for(Character character : property){
                characters.add(character);
            }

            histogramConfiguration.setShouldIgnoreWhiteSpaces(whiteSpaces);
            histogramConfiguration.setIgnoreCharacters(characters);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        }

        return histogramConfiguration;
    }

}
