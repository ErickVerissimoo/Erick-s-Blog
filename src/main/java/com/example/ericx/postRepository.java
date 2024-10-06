package com.example.ericx;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/*
 * Um repositório representa uma abstração do banco de dados
 */
@Repository
public interface postRepository  extends JpaRepository<post, Integer>{

	@Query("Select descricao from post")
	List <String> AllIds();


	
}
