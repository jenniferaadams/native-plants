package com.JA.nativeplants.repos;

import com.JA.nativeplants.entities.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
