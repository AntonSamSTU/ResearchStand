package com.example.WebAppLabsSamGTU.repo;

import com.example.WebAppLabsSamGTU.model.Gazepoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GazepointRepository extends JpaRepository<Gazepoint, Long> {
}
