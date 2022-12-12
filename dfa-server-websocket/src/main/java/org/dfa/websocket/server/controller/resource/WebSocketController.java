package org.dfa.websocket.server.controller.resource;

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
public class WebSocketController {
	
	@Autowired
	private SimpMessagingTemplate template;
	
//	@MessageMapping("/notificaciones")
//	public void sendMessage (@Payload Message message, 
//			Principal user, @Header("simpSessionId") String sessionId) {
//		
//		log.info("Sending messsage: " + message.toString() + "...");
//		OutputMessage out = new OutputMessage(message.getFrom(), message.getTo(), message.getText());
//		this.template.convertAndSend("/topic/notificaciones" , out);
//		log.info("Message sent: " + out.toString() + ".");
//	
//	}
	
	
	@MessageMapping("/websocket")
	@SendTo("/topic/notificaciones")
	public OutputMessage send (Message message) throws Exception {
		log.info("Message from: " + message.getFrom() + ", text: " + message.getText());
		return new OutputMessage(message.getFrom(), message.getTo(), message.getText());
	}

}
