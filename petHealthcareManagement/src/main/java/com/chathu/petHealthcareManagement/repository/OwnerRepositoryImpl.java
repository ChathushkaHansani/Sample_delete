package com.chathu.petHealthcareManagement.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.chathu.petHealthcareManagement.model.Owner;

@Repository("ownerRepository")
public class OwnerRepositoryImpl implements OwnerRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	public Owner save(Owner owner) {
		System.out.println(owner.getId() + owner.getOwnerName() +"=========");
		if(owner.getId()==null){
			entityManager.persist(owner);
		}else{
			owner= entityManager.merge(owner);
		}
		entityManager.flush();		
		
		return owner;
	}

}
