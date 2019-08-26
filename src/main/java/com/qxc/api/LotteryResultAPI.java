package com.qxc.api;

import com.qxc.dao.LotteryResultMapper;
import com.qxc.pojo.LotteryResult;
import com.qxc.services.LotteryResultServices;
import com.qxc.utils.APIRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LotteryResultAPI {

    @Resource
    LotteryResultServices services;


    @RequestMapping("/deleteLotteryResult.do")
    public APIRequest deleteLotteryResult(Integer id){
        return services.deleteLotteryResult(id);
    }
    @RequestMapping("/addLotteryResult.do")
    public APIRequest addLotteryResult(LotteryResult lotteryResult){
       return services.addLotteryResult(lotteryResult);
    }
    @RequestMapping("/eidtLotteryResult.do")
    public APIRequest eidtLotteryResult(LotteryResult lotteryResult){
        return services.eidtLotteryResult(lotteryResult);
    }
    @RequestMapping("/queryLotteryResult.do")
    public APIRequest queryLotteryResult(Integer year){
        return services.queryLotteryResult(year);
    }

    @RequestMapping("/queryLotteryResultDetails.do")
    public APIRequest queryLotteryResultDetails(Integer year){
        return services.queryLotteryResultDetails(year);
    }

    @RequestMapping("/queryLotteryResultYear.do")
    public APIRequest queryLotteryResultYear(){
        return services.queryLotteryResultYear();
    }






}
