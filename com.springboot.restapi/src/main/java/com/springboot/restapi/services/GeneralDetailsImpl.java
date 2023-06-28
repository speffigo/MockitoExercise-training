package com.springboot.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.restapi.details.Details;

@Service
public class GeneralDetailsImpl implements GeneralDetails {

	List<Details> list;

	public GeneralDetailsImpl() {
		list = new ArrayList<>();
		list.add(new Details(1, "Saurabh", "saurabh@mail.com"));
		list.add(new Details(2, "Pathak", "saurab12@mail.com"));
		list.add(new Details(3, "Saur", "saura03@mail.com"));
	}

	@Override
	public List<Details> getDetails() {
		return list;
	}

	@Override
	public List<Details> addDetail(Details detail) {
		list.add(detail);
		return list;
	}

	@Override
	public Details updateDetail(Details detail) {
		list.forEach(e -> {
			if (e.getId() == detail.getId()) {
				e.setName(detail.getName());
				e.setEmail(detail.getEmail());
			}
		});
		return detail;
	}

}
