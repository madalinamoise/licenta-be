package moise.fractal.figures.controllers;

import moise.fractal.figures.controllers.dto.RepositoryResponse;
import moise.fractal.figures.github.GithubClient;
import moise.fractal.figures.github.dto.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/init-repository"}, method = RequestMethod.GET)
public class FrontendController {
    private final GithubClient client;

    public FrontendController(GithubClient client) {
        this.client = client;
    }

    @GetMapping(path = "/{username}/{repository}")
    public List<RepositoryResponse> getGitRepositoryData(@PathVariable String username, @PathVariable String repository){
        String repositoryPath = username + '/' + repository;
        return client.getRepositoryContent(new Repository(repositoryPath));
//        client.getFileContributors("FlorinMsg", "TeamFixers", "src/main/java/fixers/jBugger/BusinessLogic/BugEJB.java");
    }
}
