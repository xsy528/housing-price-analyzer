package com.analyzer.dao;

import com.analyzer.dao.entity.HousingFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingFormDao  extends JpaRepository<HousingFormEntity, Integer> ,
        JpaSpecificationExecutor<HousingFormEntity> {
}