package com.dalongm.girl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dalongm
 * @description
 * @date 2019/3/23 20:35
 */
@Repository
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // 通过年龄查询
    List<Girl> findByAge(Integer age);
}
