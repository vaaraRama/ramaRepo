package com.payments.test.service;

import java.time.Duration;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import javax.net.ssl.SSLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientRequestException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.resolver.DefaultAddressResolverGroup;
import lombok.extern.slf4j.Slf4j;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

@Service
@Slf4j
public class TokenService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TokenService.class);

	WebClient webClient;

	/** Constructor injection */
	public TokenService(WebClient webClient) {
		super();
		this.webClient = webClient;
	}

	/** Method to get service token to invoke cdp and loyalty service */
	public String testWebClientDefault() {
		log.info("Start of testWebClientDefault method ");

		WebClient webClientDefault = WebClient.builder().build();
		ResponseEntity<String> response = null;
		try {
			String res = webClientDefault.get().uri("https://www.google.com").retrieve().bodyToMono(String.class)
					.block();
			return res;
		} catch (WebClientRequestException exception) {
			log.info("Exception  :: WebClientRequestException : {}", exception.toString());
			throw exception;
		} catch (Exception exception) {
			log.error("Exceptin :: exception : {}", exception.toString());
			throw exception;
		}
	}
}
