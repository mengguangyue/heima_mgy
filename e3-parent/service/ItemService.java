package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/*
	 * 需求:根据id查询商品信息
	 * 返回值:商品对象 TbItem
	 * 方法名:findItemByID
	 * 参数:Long itemId
	 */
	public TbItem findItemByID(Long itemId);
}
