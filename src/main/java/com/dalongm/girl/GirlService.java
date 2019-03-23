package com.dalongm.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dalongm
 * @description
 * @date 2019/3/23 21:28
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("B");
        girlA.setAge(20);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("CCC");
        girlB.setAge(22);
        girlRepository.save(girlB);
    }
}
