package org.dfa.websocket.client.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface GeneralKenobiApi {

	@GetMapping("/generalKenobi")
	public ResponseEntity<String> general_kenobi();
	
}
