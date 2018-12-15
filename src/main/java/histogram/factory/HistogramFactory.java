package histogram.factory;

import histogram.config.HistogramConfiguration;

import java.util.Map;

public class HistogramFactory {
    private String propertyFileName = "src/main/resources/histogram.properties";
    private final HistogramConfiguration histogramConfiguration = new HistogramConfiguration();

    public HistogramFactory() {
    }

    public HistogramFactory(String propertyFileName) {
        this.propertyFileName = propertyFileName;
    }

    public Map<Character,Long> createHistogram(String text) {
        //load configuration every time before create histogram
        return null;
    }

}
