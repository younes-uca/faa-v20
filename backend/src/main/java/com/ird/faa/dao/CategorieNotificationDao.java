package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CategorieNotification;


@Repository
public interface CategorieNotificationDao extends JpaRepository<CategorieNotification,Long> {




    CategorieNotification findByCode(String code);

    int deleteByCode(String code);



}
