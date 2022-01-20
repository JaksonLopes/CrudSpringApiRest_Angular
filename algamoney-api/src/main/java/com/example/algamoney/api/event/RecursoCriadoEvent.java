package com.example.algamoney.api.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

import lombok.Data;
@Data
public class RecursoCriadoEvent  extends ApplicationEvent{

	private HttpServletResponse response;
	private Long codigo;

	private static final long serialVersionUID = 1L;

	public RecursoCriadoEvent(Object source, HttpServletResponse response,Long codigo ) {
		super(source);
		this.response = response;
		this.codigo = codigo;
	}
	
	

}
