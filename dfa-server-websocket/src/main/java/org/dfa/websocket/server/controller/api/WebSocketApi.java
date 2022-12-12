package org.dfa.websocket.server.controller.api;

import org.dfa.websocket.server.vo.Message;
import org.dfa.websocket.server.vo.OutputMessage;

public interface WebSocketApi {

	public OutputMessage send (Message message) throws Exception;
	
}
