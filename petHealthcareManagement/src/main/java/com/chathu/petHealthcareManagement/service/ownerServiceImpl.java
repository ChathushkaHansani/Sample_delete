package com.chathu.petHealthcareManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chathu.petHealthcareManagement.model.Owner;
import com.chathu.petHealthcareManagement.repository.OwnerRepository;

@Service("ownerService")
public class ownerServiceImpl implements OwnerService {

	@Autowired
	OwnerRepository ownerRepository;

	@Transactional
	public Owner save(Owner owner) {

		return ownerRepository.save(owner);
	}

}
