package com.youtao.common.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @title: ItemCatResult
 * @description: 
 * @Copyright: Copyright (c) 2018
 * @Company: lgxkdream.github.io
 * @author gang.li
 * @version 1.0.0
 * @since 2018年3月5日 上午11:03:41
 */
public class ItemCatResult {

	@JsonProperty("data")
	private List<ItemCatData> itemCats = new ArrayList<ItemCatData>();

	public List<ItemCatData> getItemCats() {
		return itemCats;
	}

	public void setItemCats(List<ItemCatData> itemCats) {
		this.itemCats = itemCats;
	}

}
