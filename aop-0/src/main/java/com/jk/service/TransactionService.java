package com.jk.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransactionService {

	Logger logger = LoggerFactory.getLogger(TransactionService.class);

	@Autowired
	private PlatformTransactionManager transactionManager;

	public void doSomething() {
		logger.trace("entering " + getClass().getSimpleName() + "." + getClass().getEnclosingMethod().getName());
		TransactionStatus tx = transactionManager
				.getTransaction(new DefaultTransactionDefinition());
		try {
			// Business Logic
		} catch (RuntimeException ex) {
			logger.error("exception in " + getClass().getSimpleName() + "." + getClass().getEnclosingMethod().getName(), ex);
			tx.setRollbackOnly();
			throw ex;
		} finally {
			transactionManager.commit(tx);
			logger.trace("exiting " + getClass().getSimpleName() + "." + getClass().getEnclosingMethod().getName());
		}
	}

}
