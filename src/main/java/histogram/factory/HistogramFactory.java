package histogram.factory;

import histogram.config.HistogramConfigurationLoader;
import histogram.config.HistogramConfiguration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HistogramFactory {
    private String propertyFileName = "histogram.properties";
    private final HistogramConfigurationLoader histogramConfiguration = new HistogramConfigurationLoader();
    Map<Character,Long> histogram = new LinkedHashMap<>();

    public HistogramFactory() {
    }

    public HistogramFactory(String propertyFileName) {
        this.propertyFileName = propertyFileName;
    }

    public Map<Character,Long> createHistogram(String text) {
        //load configuration every time before create histogram
        HistogramConfiguration config = histogramConfiguration.loadProperties(propertyFileName);
        boolean ignoreWhiteSpaces = config.shouldIgnoreWhiteSpaces();
        Set<Character> ignoreCharacters = config.getIgnoreCharacters();
        char[] characters = text.toCharArray();

        for(int i=0;i<characters.length;i++){
            if (isWhiteSpace(characters[i])) {
                    if(ignoreWhiteSpaces) continue;
                    char tmp = whichWhiteSpace(characters[i]);
                    putWhiteSpace(tmp);
                    continue;
            }

            if(ignoreCharacters.contains(characters[i])) continue;
            else putCharacter(characters[i]);
        }
        return histogram;
    }

    private void putCharacter(char character) {
        if(histogram.containsKey(character)) histogram.put(character, histogram.get(character)+1);
        else histogram.put(character,1L);
    }

    private char whichWhiteSpace(char character) {
        if(character == HistogramConfigurationLoader.WHITE_SPACES.get(0)) return HistogramConfigurationLoader.WHITE_SPACES.get(0);
        else if(character == HistogramConfigurationLoader.WHITE_SPACES.get(1)) return HistogramConfigurationLoader.WHITE_SPACES.get(1);
        else if(character == HistogramConfigurationLoader.WHITE_SPACES.get(2)) return HistogramConfigurationLoader.WHITE_SPACES.get(2);
        else return HistogramConfigurationLoader.WHITE_SPACES.get(3);
    }

    private boolean isWhiteSpace(char character){
        if(character == HistogramConfigurationLoader.WHITE_SPACES.get(0)) return true;
        else if(character == HistogramConfigurationLoader.WHITE_SPACES.get(1)) return true;
        else if(character == HistogramConfigurationLoader.WHITE_SPACES.get(2)) return true;
        else if(character == HistogramConfigurationLoader.WHITE_SPACES.get(3)) return true;
        return false;
    }

    private void putWhiteSpace(char tmp){
        if(histogram.containsKey(tmp)) histogram.put(tmp, histogram.get(tmp)+1);
        else histogram.put(tmp,1L);
    }

}
