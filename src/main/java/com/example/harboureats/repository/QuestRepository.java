package com.example.harboureats.repository;

import com.example.harboureats.model.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Long> {
    // Add custom query methods if needed
}
