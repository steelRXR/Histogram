package histogram.factory;

import histogram.config.HistogramConfigurationLoader;
import histogram.model.HistogramConfiguration;

import java.util.Map;

public class HistogramFactory {
    private String propertyFileName = "src/main/resources/histogram.properties";
    private final HistogramConfigurationLoader histogramConfiguration = new HistogramConfigurationLoader();

    public HistogramFactory() {
    }

    public HistogramFactory(String propertyFileName) {
        this.propertyFileName = propertyFileName;
    }

    public Map<Character,Long> createHistogram(String text) {
        //load configuration every time before create histogram
        HistogramConfiguration config = histogramConfiguration.loadProperties(propertyFileName);

        //create histogram, loaded configuration should impacts
        return null;
    }

}
