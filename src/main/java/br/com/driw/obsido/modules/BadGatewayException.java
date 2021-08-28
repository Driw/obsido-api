package br.com.driw.obsido.modules;

import org.diverproject.fonsapi.modules.AutoMessageConfig;
import org.diverproject.fonsapi.modules.ModuleRuntimeException;
import org.springframework.http.HttpStatus;

public class BadGatewayException extends ModuleRuntimeException {

	public static final HttpStatus BAD_GATEWAY = HttpStatus.BAD_GATEWAY;

	public BadGatewayException(AutoMessageConfig autoMessageConfig) {
		super(BAD_GATEWAY, autoMessageConfig);
	}

	public BadGatewayException(AutoMessageConfig autoMessageConfig, Object... args) {
		super(BAD_GATEWAY, autoMessageConfig, args);
	}
}
