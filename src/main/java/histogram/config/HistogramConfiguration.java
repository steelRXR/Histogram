package histogram.config;

import java.util.HashSet;
import java.util.Set;

public class HistogramConfiguration {
    private boolean shouldIgnoreWhiteSpaces = false;
    private Set<Character> ignoreCharacters = new HashSet<>();

    public boolean shouldIgnoreWhiteSpaces() {
        return shouldIgnoreWhiteSpaces;
    }

    public void setShouldIgnoreWhiteSpaces(boolean shouldIgnoreWhiteSpaces) {
        this.shouldIgnoreWhiteSpaces = shouldIgnoreWhiteSpaces;
    }

    public Set<Character> getIgnoreCharacters() {
        return ignoreCharacters;
    }

    public void setIgnoreCharacters(Set<Character> ignoreCharacters) {
        this.ignoreCharacters = ignoreCharacters;
    }
}
