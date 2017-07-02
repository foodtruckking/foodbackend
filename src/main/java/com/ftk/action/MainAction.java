package com.ftk.action;

import com.ftk.model.FoodTruckInfo;
import com.ftk.repository.StoreInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.GET;

/**
 * Created by Keeneye7 on 2017. 7. 2..
 */
//TODO SWAGGER2 API ADD
@Controller
@RequestMapping(path="/demo")
public class MainAction {
    @Autowired
    private StoreInfoRepository storeInfoRepository;

    @GetMapping(path="/list")
    public @ResponseBody Iterable<FoodTruckInfo> getAllList() {
        return storeInfoRepository.findAll();
    }
}
