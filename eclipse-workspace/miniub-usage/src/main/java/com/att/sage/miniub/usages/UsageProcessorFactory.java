package com.att.sage.miniub.usages;

import com.att.sage.miniub.commons.usages.UsageType;
import com.att.sage.miniub.commons.usages.UsageTypeProcessor;

public class UsageProcessorFactory {

	public UsageTypeProcessor getUsageProcessor(UsageType usageType) {

		if (usageType == null)
			return null;

		switch (usageType) {
		case LOCAL:
			return new LocalUsageTypeProcessor();

		case INTERNATIONAL:
			return new InternationalUsageTypeProcessor();

		default:
			return null;
		}

	}
}

