package com.kerajaan.hindu.repository;

import com.kerajaan.hindu.model.Hindu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// menyambungkan dengan repository di postman
@Repository
public interface HinduRepository extends JpaRepository<Hindu, Long>{
}
