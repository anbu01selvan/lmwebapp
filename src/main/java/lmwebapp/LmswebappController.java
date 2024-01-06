package lmwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LmswebappController {
	@GetMapping(path = "lmgetMsg")
	public String lmgetMsg() {
		return "thi is lms jen";
	}
}
