package moise.fractal.figures.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RepositoryResponse {
    @JsonProperty
    private String name;
    @JsonProperty
    private String repoUrl;
    @JsonProperty
    private Integer noOfLines;
    @JsonProperty
    private List<Contributor> contributors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public Integer getNoOfLines() {
        return noOfLines;
    }

    public void setNoOfLines(Integer noOfLines) {
        this.noOfLines = noOfLines;
    }
}
