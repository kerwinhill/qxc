package com.qxc.services;

import com.qxc.dao.LotteryResultMapper;
import com.qxc.pojo.LotteryResult;
import com.qxc.pojo.LotteryResultDetails;
import com.qxc.utils.APIRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LotteryResultServices {

    @Resource
    LotteryResultMapper mapper;


    public APIRequest deleteLotteryResult(Integer id){
        APIRequest request = null;
        if(id == null || id == 0){
            request = new APIRequest(false,"参数错误！");
        }else{
            mapper.deleteByPrimaryKey(id);
            request = new APIRequest(true,"成功！");
        }
        return request;
    }

    public APIRequest addLotteryResult(LotteryResult lotteryResult){
        APIRequest request = null;
        if(lotteryResult == null){
            request = new APIRequest(false,"参数错误！");
        }else{
            mapper.insertSelective(lotteryResult);
            request = new APIRequest(true,"成功！");
        }
        return request;
    }

    public APIRequest eidtLotteryResult(LotteryResult lotteryResult){
        APIRequest request = null;
        if(lotteryResult == null){
            request = new APIRequest(false,"参数错误！");
        }else{
            mapper.updateByPrimaryKeySelective(lotteryResult);
            request = new APIRequest(true,"成功！");
        }
        return request;
    }

    public APIRequest queryLotteryResult(Integer year){
        APIRequest request = null;
        if(year == null ){
            request = new APIRequest(false,"参数错误！");
        }else{
            List<LotteryResult> data = mapper.query(year);
            request = new APIRequest(true,"成功！",data);
        }
        return request;
    }


    public APIRequest queryLotteryResultYear() {
        APIRequest request = null;

        List<Integer> data = mapper.queryYear();
        request = new APIRequest(true,"成功！",data);

        return request;
    }


    public APIRequest queryLotteryResultDetails(Integer year) {
        APIRequest request = null;
        if(year == null ){
            request = new APIRequest(false,"参数错误！");
        }else{
            List<LotteryResultDetails> data = mapper.queryDetails(year);
            request = new APIRequest(true,"成功！",data);
        }
        return request;
    }

    public APIRequest queryLastResult(Integer year) {
        APIRequest request = null;
        if(year == null ){
            request = new APIRequest(false,"参数错误！");
        }else{
            List<LotteryResultDetails> data = mapper.queryLastDetails(year);
            request = new APIRequest(true,"成功！",data);
        }
        return request;
    }

}
