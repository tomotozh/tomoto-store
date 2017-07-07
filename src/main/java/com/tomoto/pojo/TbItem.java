package com.tomoto.pojo;

public class TbItem {
    private Integer itemId;

    private String itemTitle;

    private String itemDesc;

    private String itemCatogery;

    private String itemPress;

    private Integer itemPrice;

    private String itemPack;

    private Integer itemDate;

    private Integer itemGrade;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle == null ? null : itemTitle.trim();
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    public String getItemCatogery() {
        return itemCatogery;
    }

    public void setItemCatogery(String itemCatogery) {
        this.itemCatogery = itemCatogery == null ? null : itemCatogery.trim();
    }

    public String getItemPress() {
        return itemPress;
    }

    public void setItemPress(String itemPress) {
        this.itemPress = itemPress == null ? null : itemPress.trim();
    }

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemPack() {
		return itemPack;
	}

	public void setItemPack(String itemPack) {
		this.itemPack = itemPack;
	}

	public Integer getItemDate() {
		return itemDate;
	}

	public void setItemDate(Integer itemDate) {
		this.itemDate = itemDate;
	}

	public Integer getItemGrade() {
		return itemGrade;
	}

	public void setItemGrade(Integer itemGrade) {
		this.itemGrade = itemGrade;
	}

	@Override
	public String toString() {
		return "TbItem [itemId=" + itemId + ", itemTitle=" + itemTitle + ", itemDesc=" + itemDesc + ", itemCatogery="
				+ itemCatogery + ", itemPress=" + itemPress + ", itemPrice=" + itemPrice + ", itemPack=" + itemPack
				+ ", itemDate=" + itemDate + ", itemGrade=" + itemGrade + "]";
	}

	
	
    
}