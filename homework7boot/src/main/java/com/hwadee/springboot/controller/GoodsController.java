package com.hwadee.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hwadee.springboot.entity.Goods;
import com.hwadee.springboot.model.LayuiPageInfo;
import com.hwadee.springboot.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @GetMapping("/list")
    LayuiPageInfo findAll(Integer page,Integer limit){
        List<Goods>datas=goodsService.findAll(page,limit);
        PageInfo<Goods>pageInfo=new PageInfo<Goods>(datas);
        //上面两行代码不能有其他数据库操作
        LayuiPageInfo result=new LayuiPageInfo();
        result.setCode(0);
        result.setMsg("出错");
        result.setData(datas);
        result.setCount(pageInfo.getTotal());
        return result;

    }
}
