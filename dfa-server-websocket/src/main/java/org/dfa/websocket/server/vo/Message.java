package org.dfa.websocket.server.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Message {

	private String from;
	private String to;
	private String text;
	
}
