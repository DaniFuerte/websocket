package org.dfa.websocket.server.controller.resource;

import org.dfa.websocket.server.controller.api.HelloThereApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloThereController implements HelloThereApi {

	@Override
	public ResponseEntity<String> hello_there() {
		return ResponseEntity.ok("Hello There!!!");
	}

}
