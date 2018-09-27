package com.pinyougou.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

//	@Reference
//	private BrandService brandService;

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		List<TbBrand> all = brandService.findAll();
		return all;
	}

	@RequestMapping("/findAll1")
	public String  findAll11(){
		int a=0;
		int b=2;
		int c=a+b;
		return String.valueOf(c);
	}
}
