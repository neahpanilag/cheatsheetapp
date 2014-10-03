package com.cheatsheetapp.cheet_v1;

import java.util.ArrayList;

import android.content.Context;

public class TagRowItem {
	String name;
	String description;
	
	public TagRowItem()
	{
		
	}
	public TagRowItem(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public static ArrayList<TagRowItem> populateTags(Context context)
	{
		ArrayList<TagRowItem> tags = new ArrayList<TagRowItem>();

		String[] tag_names = context.getResources().getStringArray(R.array.tags_array);
		for (String tag_name : tag_names) {
			int getRes = context.getResources().getIdentifier(tag_name,"string","com.cheatsheetapp.cheet_v1");
			String tag_description = (String) context.getResources().getText(getRes);
			TagRowItem tag = new TagRowItem("<"+tag_name+">",tag_description);
			tags.add(tag);
		}
		return tags;  
	}
}
