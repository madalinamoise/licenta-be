package moise.fractal.figures.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class FileContributions {

    private Integer totalLines;

    private Map<String, Integer> contributorLines;

    private Map<String, Double> contributorPercentage;

    public Integer getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(Integer totalLines) {
        this.totalLines = totalLines;
    }

    public void setContributorLines(Map<String, Integer> contributorLines) {
        this.contributorLines = contributorLines;
    }

    public Map<String, Double> getContributorPercentage() {
        if (contributorPercentage == null) {
            contributorPercentage = new HashMap<>();
            for(String contributor : contributorLines.keySet()) {
                contributorPercentage.put(contributor,  ((double) contributorLines.get(contributor) / totalLines * 100));
            }
        }

        return contributorPercentage;
    }

    public Map<String, Integer> getContributorLines() {
        return contributorLines;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for(Map.Entry<String, Double> contributor : getContributorPercentage().entrySet()) {
            joiner.add(contributor.getKey() + "=" + contributor.getValue());
        }

        return joiner.toString();
    }
}
