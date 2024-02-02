package com.example.filerouge.service;

import com.example.filerouge.domain.Announce;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AnnounceService{
    List<Announce> getAllAnnounces();

    Optional<Announce> getAnnounceById(Long id);

    Announce saveAnnounce(Announce announce);

    void deleteAnnounce(Long id);
}
