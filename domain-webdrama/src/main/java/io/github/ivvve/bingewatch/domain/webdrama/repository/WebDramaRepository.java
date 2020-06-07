package io.github.ivvve.bingewatch.domain.webdrama.repository;

import io.github.ivvve.bingewatch.domain.webdrama.entity.WebDrama;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface WebDramaRepository extends ReactiveCrudRepository<WebDrama, String> {
}
