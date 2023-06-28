package com.springboot.com.springboot.restapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springboot.restapi.controller.StudentController;
import com.springboot.restapi.details.Details;
import com.springboot.restapi.services.GeneralDetails;
import com.springboot.restapi.services.GeneralDetailsImpl;

@ExtendWith(MockitoExtension.class)
class PostTesting {

	@Mock
	private GeneralDetails gendetails;

	@InjectMocks
	private StudentController studcontroller;

	@InjectMocks
	private GeneralDetailsImpl service;

	@Test
	void testPostWithMock() {
		Details detail = new Details(11, "effigo", "go");
		when(gendetails.addDetail(detail)).thenReturn(service.addDetail(detail));
		List<Details> listdetail = studcontroller.createdetails(detail);
		assertEquals(detail, listdetail.get(3));

	}

}
