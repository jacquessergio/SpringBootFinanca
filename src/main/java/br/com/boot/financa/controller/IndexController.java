package br.com.boot.financa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/financas")
public class IndexController {

	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "/index";
	}

}
