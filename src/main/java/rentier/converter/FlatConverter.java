package rentier.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import rentier.model.Flat;
import rentier.repository.FlatRepository;

public class FlatConverter implements Converter<String, Flat> {
	@Autowired
	FlatRepository flatRepository;

	public Flat convert(String id) {
		return flatRepository.getOne(Long.valueOf(id));
	}

}
