package com.sumit.hr.management.controller;

import com.sumit.hr.management.controller.service.RegionService;
import com.sumit.hr.management.model.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/regions")
public class HRMRegionsController {

    private RegionService regionService;

    @Autowired
    public HRMRegionsController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping(value = "/")
    public  List<Regions> getAllRegions() {
        return regionService.listRegions();
    }

    @GetMapping(value = "/{region_id}")
    public @ResponseBody Regions getRegionById(@PathVariable("region_id") Integer regionId){
        return regionService.getRegioByRegionId(regionId);
    }

}
