package com.att.sage.miniub.usages;

import java.time.LocalDateTime;

import com.att.sage.miniub.commons.usages.AbstractUsage;
import com.att.sage.miniub.commons.usages.UsageType;

public class LocalUsage extends AbstractUsage{

	public LocalUsage(long id, LocalDateTime begin, LocalDateTime end, UsageType usageType) {
		super(id, begin, end, usageType);
	}

}
