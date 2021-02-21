package com.sumit.hr.management.data.repos;

import com.sumit.hr.management.model.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsRepository extends JpaRepository<Regions, Integer> {
}
