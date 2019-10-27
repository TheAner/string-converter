package pl.theaner.stringconverter;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.theaner.stringconverter.service.BasicService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StringConverterApplication.class)
class BasicConverterTests {

	@Autowired
	BasicService basicService;

	@Test
	void textToUpper(){
		String string = "TeStInG";

		String result = basicService.toUpper(string);

		assertEquals("TESTING", result);
	}

	@Test
	void emptyToUpper(){
		String string = "";

		String result = basicService.toUpper(string);

		assertEquals("", result);
	}

	@Test
	void nullToUpper(){
		String string = null;

		String result = basicService.toUpper(string);

		assertNull(result);
	}
}
