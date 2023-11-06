package ru.checkdev.mock.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.checkdev.mock.domain.Submitter;
import ru.checkdev.mock.repository.SubmitterRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubmitterService {

    private final SubmitterRepository repository;

    public Optional<Submitter> findById(Submitter submitter) {
        return repository.findById(submitter.getId());
    }
}
