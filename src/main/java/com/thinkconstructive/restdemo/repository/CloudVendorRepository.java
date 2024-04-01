package com.thinkconstructive.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkconstructive.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{

}
