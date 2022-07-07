package com.att.sage.miniub.usages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.att.sage.miniub.commons.usages.UsageInterface;
import com.att.sage.miniub.commons.usages.UsageProcessorInterface;
import com.att.sage.miniub.commons.usages.UsageType;
import com.att.sage.miniub.commons.usages.UsageTypeProcessor;

public class UsageProcessor implements UsageProcessorInterface {

	private UsageProcessorFactory usageProcessorFactory;

	public UsageProcessor() {
		super();
		this.usageProcessorFactory = new UsageProcessorFactory();
	}

	public List<UsageInterface> process(BufferedReader bufferedReader) throws IOException {
		String line;
		List<UsageInterface> list = new ArrayList<>();

		while ((line = bufferedReader.readLine()) != null) {

			String[] recordField = line.split(",");
			System.out.println(recordField[1]);
			UsageTypeProcessor usageTypeProcessor = usageProcessorFactory
					.getUsageProcessor(UsageType.valueOf(recordField[1]));

			list.add(usageTypeProcessor.process(recordField));
		}

		for (UsageInterface usageInterface : list) {
			System.out.println(usageInterface.getId());
		}

		return list;
	}

	public static void main(String[] args) throws IOException {

		UsageProcessor processorMain = new UsageProcessor();

		BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/usages.csv"));

		processorMain.process(reader);

	}

}
