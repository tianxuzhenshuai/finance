package com.atguigu.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tianxu
 * @create 2018-09-17 15:01
 */
@Controller
public class FinanceController {

    @RequestMapping("/smp")
    public String smp(){

        return "smp";
    }

    @RequestMapping("/ht.htm")
    public String ht(){

        return "ht";
    }

    /*
    一个参数类：param
    属性：            LOAN_CONTRACT_NUM合同编号，CLIENT_NAME客户姓名，IDENTITY_NUM证件号
                     贷款品种，城市地区，营业部
                     合同状态，合同签订时间，放款时间
                     信托机构，信托产品系列，信托计划
                     业务模式，合同变更类型，


     */



}
