import histogram.CSV.HistogramCSVGenerator;
import histogram.HistogramFacade;
import histogram.factory.HistogramFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HistogramFacade histogramFacade = new HistogramFacade();
        System.out.println(histogramFacade.generateHistogram("TEST HISTOGRAM #!"));
        System.out.println(histogramFacade.generateHistogramCSV("TEST HISTOGRAM #!"));


    }
}
