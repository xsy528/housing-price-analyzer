package com.analyzer.dao;

import com.analyzer.dao.entity.WebFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WebFormDao extends JpaRepository<WebFormEntity, Long> {

}
