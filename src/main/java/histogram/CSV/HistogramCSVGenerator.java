package histogram.CSV;

import java.util.Map;

public class HistogramCSVGenerator {
    private static final char SEPARATOR = ',';
    private static final char NEW_LINE = '\n';

    public String convertHistogramToCSV(Map<Character, Long> histogram) {
        String histogramCSV;
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Character,Long> entry : histogram.entrySet()) {
            stringBuilder.append(entry.getKey()).append(SEPARATOR).append(entry.getValue()).append(NEW_LINE);
        }

        histogramCSV = stringBuilder.toString();
        return histogramCSV;
    }


}
