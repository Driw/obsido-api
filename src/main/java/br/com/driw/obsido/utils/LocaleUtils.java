package br.com.driw.obsido.utils;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public final class LocaleUtils {

	private LocaleUtils() { }

	public static Locale current() {
		return LocaleContextHolder.getLocale();
	}
}
