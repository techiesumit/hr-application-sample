package com.sumit.hr.management.controller.service;

import com.sumit.hr.management.data.repos.RegionsRepository;
import com.sumit.hr.management.model.Regions;
import okhttp3.internal.Internal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {
    private RegionsRepository regionsRepository;

    @Autowired
    public RegionService(RegionsRepository regionsRepository) {
        this.regionsRepository = regionsRepository;
    }

    public List<Regions> listRegions() {
        return regionsRepository.findAll();
    }
    public  Regions getRegioByRegionId(int region_id){
        Optional<Regions> region = regionsRepository.findById(region_id);
        if (region.isEmpty()) {
            // Throw custom error or Response code with Message ??
        }
        return region.get();

    }

}
