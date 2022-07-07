package com.att.sage.miniub.usages;

import java.time.LocalDateTime;

import com.att.sage.miniub.commons.usages.AbstractUsage;
import com.att.sage.miniub.commons.usages.UsageType;

public class InternationalUsage extends AbstractUsage	{
	
	private final String originCountry;
	private final String destinyCountry;	

	public InternationalUsage(long id, LocalDateTime begin, LocalDateTime end, UsageType usageType,String originCountry, String destinyCountry) {
		super(id, begin, end, usageType);
		this.originCountry = originCountry;
		this.destinyCountry = destinyCountry;
	}

}
