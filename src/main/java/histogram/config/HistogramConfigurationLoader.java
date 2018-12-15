package histogram.config;

import java.util.Arrays;
import java.util.List;

public class HistogramConfigurationLoader {
    public final static List<Character> WHITE_SPACES = Arrays.asList(
            '\n', '\t', '\r', ' ');


    public HistogramConfiguration loadProperties(String propertyFileName) {
        //load property from file name
        return new HistogramConfiguration();
    }

}
