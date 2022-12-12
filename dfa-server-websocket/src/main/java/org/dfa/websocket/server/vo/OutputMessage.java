package org.dfa.websocket.server.vo;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OutputMessage extends Message {

	private LocalDateTime dateTime;
	
	public OutputMessage(String from, String to, String text) {
		super(from, to, text);
		this.dateTime = LocalDateTime.now();
	}

}
