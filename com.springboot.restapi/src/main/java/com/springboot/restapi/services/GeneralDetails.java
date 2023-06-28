package com.springboot.restapi.services;

import java.util.List;

import com.springboot.restapi.details.Details;

public interface GeneralDetails {

	public List<Details> getDetails();

	public List<Details> addDetail(Details detail);

	public Details updateDetail(Details detail);

}
