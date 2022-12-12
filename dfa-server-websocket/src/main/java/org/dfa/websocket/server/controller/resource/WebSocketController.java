package org.dfa.websocket.server.controller.resource;

import org.dfa.websocket.server.controller.api.WebSocketApi;
import org.dfa.websocket.server.service.IWebSocketServerService;
import org.dfa.websocket.server.vo.Message;
import org.dfa.websocket.server.vo.OutputMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class WebSocketController implements WebSocketApi {
	
	@Autowired
	private IWebSocketServerService sockServ;
	
	@Autowired
	private SimpMessagingTemplate template;
	
	@Override
	@MessageMapping("/websocket")
	@SendTo("/topic/notificaciones")
	public OutputMessage send (Message message) throws Exception {
		log.info("Message from: " + message.getFrom() + ", text: " + message.getText());
		return this.sockServ.send(message);
	}

}
