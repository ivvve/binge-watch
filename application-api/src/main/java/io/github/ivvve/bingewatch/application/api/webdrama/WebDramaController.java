package io.github.ivvve.bingewatch.application.api.webdrama;

import io.github.ivvve.bingewatch.domain.webdrama.entity.WebDrama;
import io.github.ivvve.bingewatch.domain.webdrama.service.WebDramaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("web-dramas")
public class WebDramaController {
    private final WebDramaService webDramaService;

    @GetMapping
    public Flux<WebDrama> getAll() {
        return this.webDramaService.getAll();
    }
}
