package com.att.sage.miniub.usages;

import java.time.LocalDateTime;

import com.att.sage.miniub.commons.usages.UsageInterface;
import com.att.sage.miniub.commons.usages.UsageType;
import com.att.sage.miniub.commons.usages.UsageTypeProcessor;

import utils.DateUtils;

public class InternationalUsageTypeProcessor implements UsageTypeProcessor {

	@Override
	public UsageInterface process(String[] recordField) {

		long id = Long.parseLong(recordField[0]);
		LocalDateTime begin = DateUtils.timeToLocalDateTime(recordField[2]);
		LocalDateTime end = DateUtils.timeToLocalDateTime(recordField[3]);

		return new InternationalUsage(id, begin, end, UsageType.INTERNATIONAL, recordField[4], recordField[5]);
	}

}
