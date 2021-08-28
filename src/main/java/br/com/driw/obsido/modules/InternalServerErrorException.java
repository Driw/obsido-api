package br.com.driw.obsido.modules;

import org.diverproject.fonsapi.modules.AutoMessageConfig;
import org.diverproject.fonsapi.modules.ModuleRuntimeException;
import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends ModuleRuntimeException {

	public static final HttpStatus INTERNAL_SERVER_ERROR = HttpStatus.INTERNAL_SERVER_ERROR;

	public InternalServerErrorException(Exception e) {
		super(e);
	}

	public InternalServerErrorException(Exception e, AutoMessageConfig autoMessageConfig, Object... args) {
		super(INTERNAL_SERVER_ERROR, autoMessageConfig, args);
	}
}
