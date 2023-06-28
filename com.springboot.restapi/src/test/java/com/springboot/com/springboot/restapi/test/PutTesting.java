package com.springboot.com.springboot.restapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

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
class PutTesting {

	@Mock
	private GeneralDetails generalDetails;

	@InjectMocks
	private StudentController studentController;

	@InjectMocks
	private GeneralDetailsImpl services;

	@Test
	void testPutWithMock() {

		Details detail = new Details(1, "Saurabh", "pathak@mail.com");
		when(generalDetails.updateDetail(detail)).thenReturn(services.updateDetail(detail));
		assertEquals(detail, studentController.updateDetail(detail));
	}

}
