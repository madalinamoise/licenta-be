package moise.fractal.figures.controllers;

import moise.fractal.figures.controllers.dto.RepositoryResponse;
import moise.fractal.figures.github.GithubClient;
import moise.fractal.figures.github.dto.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/path-repository"}, method = RequestMethod.POST)
public class PathController {
    private final GithubClient client;

    public PathController(GithubClient client) {
        this.client = client;
    }

    @PostMapping(path = "/{username}/{repository}")
    public List<RepositoryResponse> getGitRepositoryData(@RequestBody String repoUrl, @PathVariable String username, @PathVariable String repository){
        String repositoryPath = username + '/' + repository;

        return client.getRepositoryResponses(new Repository(repositoryPath),repoUrl);
    }
}
