package br.com.driw.obsido.modules.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@CrossOrigin
@RestController
@RequestScope
@RequestMapping("/core")
public class CoreController {

	private final CoreService service;

	@Autowired
	public CoreController(CoreService service) {
		this.service = service;
	}


}
