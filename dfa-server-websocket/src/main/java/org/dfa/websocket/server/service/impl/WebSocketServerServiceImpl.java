package org.dfa.websocket.server.service.impl;

import org.dfa.websocket.server.service.IWebSocketServerService;
import org.dfa.websocket.server.vo.Message;
import org.dfa.websocket.server.vo.OutputMessage;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WebSocketServerServiceImpl implements IWebSocketServerService {

	@Override
	public OutputMessage send (Message message) throws Exception {

		try {
			return new OutputMessage(message.getFrom(),message.getText(),message.getText());
		} catch (Exception e) {
			log.error("send::error: " + e.getMessage());
			throw e;
		}
		
	}
	
}
