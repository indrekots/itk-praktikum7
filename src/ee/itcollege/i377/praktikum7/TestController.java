package ee.itcollege.i377.praktikum7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	public static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		log.debug("päring jõudis kontrollerini");
		return "test controller";
	}
	
	@RequestMapping("/login")
	public String login() {
		log.debug("kasutaja suunati login lehele");
		return "login";
	}

}
