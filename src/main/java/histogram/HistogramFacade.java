package histogram;

import histogram.CSV.HistogramCSVGenerator;
import histogram.factory.HistogramFactory;

import java.util.Map;

public class HistogramFacade {
    HistogramFactory histogramFactory = new HistogramFactory();
    HistogramCSVGenerator histogramCSVGenerator = new HistogramCSVGenerator();

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
