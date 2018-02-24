package com.jk.repository;

import com.jk.domain.Domain;
import org.springframework.stereotype.Repository;


@Repository
public class DomainRepository {
	
	public Domain findDomainObject() {
		return new Domain();
	}

}
