package br.com.driw.obsido.modules;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.diverproject.scarlet.util.ScarletUtils.nameOf;

@Service
public class ObjectMapperService {

	private final ObjectMapper objectMapper;

	@Autowired
	public ObjectMapperService(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public String toJSON(Object object) {
		try {
			return this.objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new InternalServerErrorException(e, ObjectMapperError.TO_JSON, nameOf(object));
		}
	}

	public <T> T updateFromJSON(T target, String json) {
		try {
			return this.objectMapper.readerForUpdating(target)
				.readValue(json);
		} catch (JsonProcessingException e) {
			throw new InternalServerErrorException(e, ObjectMapperError.UPDATE_FROM_JSON, nameOf(target), json);
		}
	}

	public <T> T copyFrom(Object source, Class<T> targetClass) {
		String json = null;

		try {
			json = this.objectMapper.writeValueAsString(source);
		} catch (JsonProcessingException e) {
			throw new InternalServerErrorException(e, ObjectMapperError.COPY_FROM_WRITE_JSON, nameOf(source));
		}

		try {
			return this.objectMapper.readValue(json, targetClass);
		} catch (JsonProcessingException e) {
			throw new InternalServerErrorException(e, ObjectMapperError.COPY_FROM_READ_JSON, nameOf(targetClass), json);
		}
	}

	public <S, D> D copyFromTo(S source, D destination) {
		String sourceJSON = null;

		try {
			sourceJSON = this.objectMapper.writeValueAsString(source);
		} catch (JsonProcessingException e) {
			throw new InternalServerErrorException(e, ObjectMapperError.COPY_FROM_TO, nameOf(source));
		}

		return this.updateFromJSON(destination, sourceJSON);
	}
}
