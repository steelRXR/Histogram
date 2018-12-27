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
        Map<Character, Long> histogram = histogramFactory.createHistogram(text);
        return histogram;
    }

    public String generateHistogramCSV(String text) {
        String histogramCSV = histogramCSVGenerator.convertHistogramToCSV(generateHistogram(text));
        return histogramCSV;
    }

    public void saveHistogramToCSV(String text, String fileName) {
       try{
           BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
           writer.write(text);
           writer.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }

}
