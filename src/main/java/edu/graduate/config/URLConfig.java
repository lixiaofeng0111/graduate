package edu.graduate.config;

import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class URLConfig {
	@Bean
	public ServletWebServerFactory webServerFactory() {
		TomcatServletWebServerFactory fa = new TomcatServletWebServerFactory();
		fa.addConnectorCustomizers(
				(TomcatConnectorCustomizer) connector -> connector.setProperty("relaxedQueryChars", "[]{}"));
		return fa;
	}

}
