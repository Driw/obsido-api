package br.com.driw.obsido.modules;

import org.diverproject.fonsapi.modules.AutoMessageConfig;
import org.diverproject.fonsapi.modules.ModuleRuntimeException;
import org.springframework.http.HttpStatus;

public class ConflictException extends ModuleRuntimeException {

	public static final HttpStatus CONFLICT = HttpStatus.CONFLICT;

	public ConflictException(AutoMessageConfig autoMessageConfig, Object... args) {
		super(CONFLICT, autoMessageConfig, args);
	}

	public ConflictException(Exception e) {
		super(e, CONFLICT);
	}
}
