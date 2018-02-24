package com.jk.service;

import com.jk.domain.Domain;
import com.jk.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

	@Autowired
	DomainRepository repository;

	public Domain service() {
		return repository.findDomainObject();
	}
}
