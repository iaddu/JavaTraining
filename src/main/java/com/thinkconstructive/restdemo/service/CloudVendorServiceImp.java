package com.thinkconstructive.restdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImp implements CloudVendorService {
	public CloudVendorRepository cloudVendorRepository ;
	public CloudVendorServiceImp(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository=cloudVendorRepository;
	}
	
	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "delted Successfully";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}
