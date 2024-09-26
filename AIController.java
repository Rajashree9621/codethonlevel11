package com.bot.controller;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class AIController<OllamaChatClient> {
	
	private OllamaChatClient client;
	
	private static final String PROMPT="What is Java";
	
	public AIController(OllamaChatClient client) {
		this.client=client;
	}	
     
	@GetMapping("/prompt")
	public String promptResponse(
			@RequestParam("prompt")String prompt
			) {
		Prompt p = new Prompt(prompt);
		String response = Stream(p);

		return response;
	}

	private String Stream(Prompt p) {
		// TODO Auto-generated method stub
		return PROMPT;
	}

}
