package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.Cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudvendorAPIService {

    Cloudvendor cloudvendor;
    @GetMapping("{vendorId}")
    public Cloudvendor getCloudVendorDetails(String vendorId)
    {
        return cloudvendor;
        //    return new Cloudvendor("c1","Vendor 1", "Address 1", "xxxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody Cloudvendor cloudvendor)
    {
    this.cloudvendor = cloudvendor;
    return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody Cloudvendor cloudvendor)
    {
        this.cloudvendor = cloudvendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID)
    {
        this.cloudvendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
