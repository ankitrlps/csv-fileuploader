package com.demo.csvuploader.data.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.csvuploader.data.entities.TransferEntity;

public interface InfoTransferRepository extends CrudRepository<TransferEntity, Integer> {

	@Query(nativeQuery=true, value = "select count(*) from information_schema.columns where table_schema = 'csvuploader' and table_name = 'transfer_test'")
	public int findNumberOfColumns();
	
}
