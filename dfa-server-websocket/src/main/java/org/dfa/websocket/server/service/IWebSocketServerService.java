package org.dfa.websocket.server.service;

import org.dfa.websocket.server.vo.Message;
import org.dfa.websocket.server.vo.OutputMessage;

public interface IWebSocketServerService {

	public OutputMessage send (Message message) throws Exception;
	
}
