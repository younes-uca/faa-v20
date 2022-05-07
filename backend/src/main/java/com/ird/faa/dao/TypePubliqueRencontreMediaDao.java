package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypePubliqueRencontreMedia;


@Repository
public interface TypePubliqueRencontreMediaDao extends JpaRepository<TypePubliqueRencontreMedia,Long> {





    List<TypePubliqueRencontreMedia> findByTypePubliqueCode(String code);
    int deleteByTypePubliqueCode(String code);

    List<TypePubliqueRencontreMedia> findByTypePubliqueId(Long id);

    int deleteByTypePubliqueId(Long id);

    List<TypePubliqueRencontreMedia> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);


}
