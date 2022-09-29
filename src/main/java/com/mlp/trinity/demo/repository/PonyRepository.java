package com.mlp.trinity.demo.repository;

import com.mlp.trinity.demo.models.Pony;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PonyRepository extends JpaRepository<Pony, Long> {
    //findByName(Pony)
}
