package org.dfa.websocket.client.controller;

import org.dfa.websocket.client.controller.api.GeneralKenobiApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralKenobiController implements GeneralKenobiApi {

	@Override
	public ResponseEntity<String> general_kenobi() {
		return ResponseEntity.ok("General Kenobi!!!");
	}

}
