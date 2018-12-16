package histogram;

import histogram.CSV.HistogramCSVGenerator;
import histogram.factory.HistogramFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class HistogramFacade {

    private HistogramFactory histogramFactory;
    private HistogramCSVGenerator histogramCSVGenerator = new HistogramCSVGenerator();

    public HistogramFacade() {
        this.histogramFactory = new HistogramFactory();
    }

    public HistogramFacade(String propertyFileName) {
        histogramFactory = new HistogramFactory(propertyFileName);
    }

    public Map<Character, Long> generateHistogram(String text) {
        //return histogram from passed text
        return null;
    }

    public String generateHistogramCSV(String text) {
        //return histogram CSV in String
        return null;
    }

    public void saveHistogramToCSV(String text, String fileName) {
        //generate histogram from passed text as argument and save him as CSV to file
    }

}
