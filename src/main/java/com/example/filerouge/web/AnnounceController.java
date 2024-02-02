package com.example.filerouge.web;

import com.example.filerouge.domain.Announce;
import com.example.filerouge.service.AnnounceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/announces")
public class AnnounceController {
    private final AnnounceService announceService;
    @GetMapping
    public List<Announce> getAllAnnounces() {
        return announceService.getAllAnnounces();
    }

    @GetMapping("/{id}")
    public Optional<Announce> getAnnounceById(@PathVariable Long id) {
        return announceService.getAnnounceById(id);
    }

    @PostMapping
    public Announce saveAnnounce(@RequestBody Announce announce) {
        return announceService.saveAnnounce(announce);
    }

    @DeleteMapping("/{id}")
    public void deleteAnnounce(@PathVariable Long id) {
        announceService.deleteAnnounce(id);
    }
}
