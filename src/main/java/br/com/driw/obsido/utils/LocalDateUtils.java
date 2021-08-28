package br.com.driw.obsido.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class LocalDateUtils {

	public static long differenceInDays(LocalDate a, LocalDate b) {
		return ChronoUnit.DAYS.between(a, b);
	}

	public static String toNumberString(LocalDate localDate) {
		return String.format("%04d%02d%02d", localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
	}
}
