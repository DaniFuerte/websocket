package org.dfa.websocket.server.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface HelloThereApi {

	@GetMapping("/helloThere")
	public ResponseEntity<String> hello_there();
	
}
