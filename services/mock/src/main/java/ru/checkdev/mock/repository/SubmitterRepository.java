package ru.checkdev.mock.repository;

import org.springframework.data.repository.CrudRepository;
import ru.checkdev.mock.domain.Submitter;

public interface SubmitterRepository extends CrudRepository<Submitter, Integer> {
}
