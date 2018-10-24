package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {
	//查询所有商品信息
	public List<TbBrand> findAll();
	//品牌分页
	PageResult findPage(Integer pageNum,Integer pageSize);
	//添加
	public void add(TbBrand tbBrand);
	//根据id查询
	public TbBrand findOne(Long id);
	//修改商品
	public void update(TbBrand tbBrand);
	//删除商品
	public void delete(Long[] ids);
	//条件查询
	PageResult findPage(TbBrand tbBrand,Integer pageNum,Integer pageSize);
	//品牌下拉数据
	public List<Map> selectOptionList();

}
