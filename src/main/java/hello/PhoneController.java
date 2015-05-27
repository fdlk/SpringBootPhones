package hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

	private List<Phone> phones = Arrays.asList(new Phone("3", "dell-streak-7",
			"img/phones/dell-streak-7.0.jpg", "Dell Streak 7",
			"The worst thing"), new Phone("0", "motorola-xoom-with-wi-fi",
			"img/phones/motorola-xoom-with-wi-fi.0.jpg",
			"Motorola XOOM with Wi-Fi", "The next best thing"));

	@RequestMapping("/phones")
	public List<Phone> getPhones() {
		return phones;
	}
}
