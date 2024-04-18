package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
	public String testBlock() {
		return "testBlock";
	}
	public String testUnblock() {
		return "testUnblock";
	}
}
