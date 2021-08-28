package br.com.driw.obsido.modules;

import lombok.Getter;
import org.diverproject.fonsapi.modules.AutoMessageConfig;

public enum ObjectMapperError implements AutoMessageConfig {

	TO_JSON("messages.modules.objectMapper.toJSON"),
	UPDATE_FROM_JSON("messages.modules.objectMapper.updateFromJSON"),
	COPY_FROM_WRITE_JSON("messages.modules.objectMapper.copyFromWriteJSON"),
	COPY_FROM_READ_JSON("messages.modules.objectMapper.copyFromReadJSON"),
	COPY_FROM_TO("messages.modules.objectMapper.copyFromTo");

	@Getter
	private final String message;

	ObjectMapperError(String message) {
		this.message = message;
	}
}
