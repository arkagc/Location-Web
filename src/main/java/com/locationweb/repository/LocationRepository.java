package com.locationweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locationweb.entities.Locations;

@Repository
public interface LocationRepository extends JpaRepository<Locations, Long> {

}
