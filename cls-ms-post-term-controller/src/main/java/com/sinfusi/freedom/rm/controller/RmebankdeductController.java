package com.sinfusi.freedom.rm.controller;

import com.sinfusi.freedom.core.lock.RedisLock;
import com.sinfusi.freedom.core.rabbitmq.RabbitSender;
import com.sinfusi.freedom.rm.service.IRmEbankdeductDetService;
import io.micrometer.core.annotation.Timed;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@Api(tags = "银行划扣")
public class RmebankdeductController {

    Logger log = LoggerFactory.getLogger(RmebankdeductController.class);

    @Autowired
    private static IRmEbankdeductDetService iRmEbankdeductDetService;

    @Autowired
    private RedisLock bpmlock;

    @Autowired
    private RabbitSender rabbitSender;

    @Value("${rabbitmq.queue.testMq}")
    private String testMq;



    /**
     * 生成划扣文件.
     *
     * @return 生成划扣文件
     */
    @PostMapping("/createAllRmEbankDeductFile/rm-ebankdeduct-dets")
    @Timed
    @ApiOperation(value = "生成划扣文件",notes = "")
    public Map createAllRmEbankDeductFile(@RequestBody Map<String,Object> map) throws Exception {
        log.debug("REST请求生成划扣文件: {}");
        // custClassId + bankType 参数扩增后同步更新 RmRentplantabZlService.rmEbankWaterDetService()方法
        // 因生成划扣文件时间较长 延长时间至30min
        /*Boolean isLock = bpmlock.commonLock("ebank_deduct"+custClassId+bankType,"ebank_deduct", 1800);
        Map map = new HashMap();
        try{
            if(!isLock){
                throw new BusinessException("正在生成划扣文件,请稍后在操作...");
            }
            map = iRmEbankdeductDetService.createAllRmEbankDeductFile("retamtType",custClassId,bankType);
        }catch (Exception e){
            e.printStackTrace();g
        }finally {
            bpmlock.commonUnlock("ebank_deduct"+custClassId+bankType,"ebank_deduct");
        }
        return  map;*/

        return map;

    }

    @GetMapping("/testMq")
    public void testMq(){
        System.out.println("发送测试消息");
        rabbitSender.send(testMq,"测试消息");
    }

    @GetMapping("/testObs")
    public void testObs(){

    }
}
