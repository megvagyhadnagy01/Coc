package com.jsfspring.curddemo.repositry;

import com.jsfspring.curddemo.entity.FoglalasEntity;
import com.jsfspring.curddemo.entity.RepterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FoglalasRepo extends JpaRepository<FoglalasEntity, Long> {

    FoglalasEntity findFoglalasEntityByJegy(String jegy);

    @Modifying
    @Query(value="delete from FoglalasEntity r where r.jegy = ?1")
    void deleteByJegy(String jegy);

}
