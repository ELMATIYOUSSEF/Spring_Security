package com.example.filerouge.repository;

import com.example.filerouge.domain.Announce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnounceRepository extends JpaRepository<Announce, Long> {

}
