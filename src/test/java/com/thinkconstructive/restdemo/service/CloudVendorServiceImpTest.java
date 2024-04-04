package com.thinkconstructive.restdemo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.repository.CloudVendorRepository;


class CloudVendorServiceImpTest {

	
	@Mock
	private CloudVendorRepository cloudVendorRepository;
	
	private CloudVendorService cloudVendorService;
	AutoCloseable autoCloseable;
	CloudVendor cloudVendor;
	
	

	@BeforeEach
	void setUp() throws Exception {
		autoCloseable=MockitoAnnotations.openMocks(this);
		cloudVendorService=new CloudVendorServiceImp(cloudVendorRepository);
		cloudVendor =new CloudVendor("1","amazon","usa","353");
	}

	@AfterEach
	void tearDown() throws Exception {
		autoCloseable.close();
	}
	
	@Test
	void testCreateCloudVendor() {
		/*cloudVendorRepository.save(cloudVendor);
		return "success";
		*/
		mock(CloudVendorRepository.class);
		mock(CloudVendor.class);
		when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
		assertThat(cloudVendorService.createCloudVendor(cloudVendor)).isEqualTo("success");
	}
	/*
	  @Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "success";
	}
	*/
	@Test
	void testUpdateCloudVendor() {
		mock(CloudVendorRepository.class);
		mock(CloudVendor.class);
		when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
		assertThat(cloudVendorService.updateCloudVendor(cloudVendor)).isEqualTo("success");
	}

	@Test
	void testGetCloudVendor() {
		mock(CloudVendorRepository.class);
		mock(CloudVendor.class);
		when(cloudVendorRepository.findById("1")).thenReturn(Optional.ofNullable(cloudVendor));
		assertThat(cloudVendorService.getCloudVendor("1").getVendorName()).isEqualTo(cloudVendor.getVendorName());
	}
	
	@Test
	void testGetAllCloudVendors() {
		mock(CloudVendorRepository.class);
		mock(CloudVendor.class);
		when(cloudVendorRepository.findAll()).thenReturn(new ArrayList<CloudVendor>(Collections.singleton(cloudVendor)));
		assertThat(cloudVendorService.getAllCloudVendors().get(0).getVendorPhoneNumber()).isEqualTo(cloudVendor.getVendorPhoneNumber());
	}
	
	

}
