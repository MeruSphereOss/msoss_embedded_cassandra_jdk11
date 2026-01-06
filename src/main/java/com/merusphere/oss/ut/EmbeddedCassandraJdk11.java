package com.merusphere.oss.ut;

import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EmbeddedCassandraJdk11 {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmbeddedCassandraJdk11.class);

	public static void main(String[] args) throws Exception {
		try {
			LOGGER.error("NOERR Starting UnitCassandraBootstrap");

			Long timeout = 60000L;
			for (String arg : args) {
				String[] tokens = arg.split("=");
				if (tokens.length == 2) {
					String name = tokens[0];
					String value = tokens[1];
					if (name.equals("timeout")) {
						timeout = Long.parseLong(value);
					}
				}
			}
			System.setProperty("logback.configurationFile", "logback-cassandra.xml");
			EmbeddedCassandraServerHelper.startEmbeddedCassandra(timeout);
			Thread.currentThread().join();
		} catch (Exception e) {
			LOGGER.error("Failed to run UnitCassandraBootstrap");
		}
	}
}
