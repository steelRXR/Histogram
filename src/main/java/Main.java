import histogram.CSV.HistogramCSVGenerator;
import histogram.HistogramFacade;
import histogram.factory.HistogramFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HistogramFacade histogramFacade = new HistogramFacade();
        //histogramFacade.generateHistogram("TEST HISTOGRAM #!");

        Map<Character,Long> mapa;
        HistogramFactory histogramFactory = new HistogramFactory();

        mapa = histogramFactory.createHistogram("Franek Koćwin to mały  żyd ??#@$");

        for (Map.Entry<Character,Long> entry : mapa.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        HistogramCSVGenerator histogramCSVGenerator = new HistogramCSVGenerator();
        String g = histogramCSVGenerator.convertHistogramToCSV(mapa);
        System.out.println(g);
        histogramFacade.saveHistogramToCSV(g,"histogramCSV.txt");


    }
}
