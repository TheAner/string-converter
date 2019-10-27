package pl.theaner.stringconverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.theaner.stringconverter.service.BasicService;

@RestController
public class BasicController {

	@Autowired
	BasicService basicService;

	@PostMapping("/toUpper")
	public String toUpperCase(@RequestParam String toConvert){
		return basicService.toUpper(toConvert);
	}
}
