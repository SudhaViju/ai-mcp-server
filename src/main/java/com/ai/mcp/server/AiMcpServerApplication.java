package com.ai.mcp.server;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AiMcpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiMcpServerApplication.class, args);
	}

	/*@Bean
	public ToolCallbackProvider weatherTools(WeatherService weatherService){
		return MethodToolCallbackProvider.builder().toolObjects(weatherService).build();
	}*/

}
