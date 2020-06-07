package io.github.ivvve.bingewatch.domain.webdrama.service;

import io.github.ivvve.bingewatch.domain.webdrama.entity.WebDrama;
import io.github.ivvve.bingewatch.domain.webdrama.repository.WebDramaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class WebDramaService {
    private final WebDramaRepository webDramaRepository;

    public Flux<WebDrama> getAll() {
        return this.webDramaRepository.findAll();
    }
}
