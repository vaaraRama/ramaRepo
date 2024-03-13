
package com.payments.test.config;

import javax.net.ssl.SSLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.resolver.DefaultAddressResolverGroup;
import reactor.netty.http.client.HttpClient;

@Configuration
public class WebClientConfig {

	/** Method to return Default WebClient */
	@Bean
	@Primary
	public WebClient webClient() {
	
		WebClient webClient = null;
	    SslContext sslContext;
	try {
		sslContext = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE)
		           .build();
		 final Long readTimeout = 120000L;
	       ClientHttpConnector httpConnector = new ReactorClientHttpConnector(
	               HttpClient.create().secure(t->t.sslContext(sslContext))
	               .resolver(DefaultAddressResolverGroup.INSTANCE)  
	               );
	       webClient= WebClient.builder()
	  	         .clientConnector(httpConnector)
	  	         .build();
	} catch (SSLException e) {
		e.printStackTrace();
	}
	
	return webClient;
	}
	

}
