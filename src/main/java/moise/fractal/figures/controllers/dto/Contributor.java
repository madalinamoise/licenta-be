package moise.fractal.figures.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contributor {
    @JsonProperty
    private String name;
    @JsonProperty
    private Integer lines;
    @JsonProperty
    private Double percentage;
    @JsonProperty
    private Integer area;

    public Contributor(String name, Integer lines){
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}
