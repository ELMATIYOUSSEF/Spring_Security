package com.example.filerouge.service.impl;

import com.example.filerouge.domain.Announce;
import com.example.filerouge.repository.AnnounceRepository;
import com.example.filerouge.service.AnnounceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnnounceServiceImpl implements AnnounceService {

    private final AnnounceRepository announceRepository;

    @Override
    public List<Announce> getAllAnnounces() {
        return announceRepository.findAll();
    }

    @Override
    public Optional<Announce> getAnnounceById(Long id) {
        return announceRepository.findById(id);
    }

    @Override
    public Announce saveAnnounce(Announce announce) {
        return announceRepository.save(announce);
    }

    @Override
    public void deleteAnnounce(Long id) {
        announceRepository.deleteById(id);
    }
}
