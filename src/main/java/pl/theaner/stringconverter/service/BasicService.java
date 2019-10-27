package pl.theaner.stringconverter.service;

import org.springframework.stereotype.Service;

@Service
public class BasicService {
	public String toUpper(String toConvert) {
		if(toConvert == null)
			return null;
		return toConvert.toUpperCase();
	}
}
