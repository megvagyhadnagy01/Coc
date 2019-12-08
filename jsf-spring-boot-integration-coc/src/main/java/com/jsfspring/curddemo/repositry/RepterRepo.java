package com.jsfspring.curddemo.repositry;

import com.jsfspring.curddemo.entity.RepterEntity;
import com.jsfspring.curddemo.entity.UtasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepterRepo extends JpaRepository<RepterEntity, Long> {
    RepterEntity findRepterEntityByRepterkod(String repterkod);

    @Modifying
    @Query(value="delete from RepterEntity r where r.repterkod = ?1")
    void deleteByRepterkod(String repterkod);
}
