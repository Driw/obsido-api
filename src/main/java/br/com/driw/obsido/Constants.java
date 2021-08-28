package br.com.driw.obsido;

import java.time.ZoneId;

public class Constants {

	public static final long NO_ID = 0L;
	public static final String SWAGGER_API_KEY = "ba831c1c-824f-4c46-8c3f-362cc2c6aa4d";

	public static final String JSON_DATE = "yyyy-MM-dd";

	public static final String LOCAL_ZONE = "America/Sao_Paulo";
	public static final ZoneId ZONE_ID = ZoneId.of(LOCAL_ZONE);

	private Constants() { }
}
