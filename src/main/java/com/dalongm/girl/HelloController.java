package com.dalongm.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author dalongm
 * @description
 * @date 2019/3/23 17:11
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    //    @RequestMapping(value={"/hello","/hi"}, method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
    //    return girlProperties.toString();
        return "id: " + id;
    }
}
