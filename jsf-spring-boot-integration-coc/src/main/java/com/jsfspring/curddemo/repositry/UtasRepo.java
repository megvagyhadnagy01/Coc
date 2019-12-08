package com.jsfspring.curddemo.repositry;

import com.jsfspring.curddemo.entity.UtasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtasRepo extends JpaRepository<UtasEntity, Long> {
}
