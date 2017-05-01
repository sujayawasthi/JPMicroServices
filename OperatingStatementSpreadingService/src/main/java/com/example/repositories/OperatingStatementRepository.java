package com.example.repositories;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.OperatingStatement;

@RepositoryRestResource
//(collectionResourceRel = "people", path = "people")
public interface OperatingStatementRepository extends PagingAndSortingRepository<OperatingStatement, Long> {

	List<OperatingStatement> findByType(@Param("type") String type);

}