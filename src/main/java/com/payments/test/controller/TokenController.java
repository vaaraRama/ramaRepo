package com.payments.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payments.test.service.TokenService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Validated
@Slf4j
@CrossOrigin("*")
public class TokenController {
	// Test webclient and rest client
	@Autowired
	private TokenService tokenService;

	@GetMapping("helath")
	public String health() {
		return "server up";
	}

	@GetMapping("testWebClient")
	public ResponseEntity<String> getServiceTokenByWebClientDefault() {

		String response = tokenService.testWebClientDefault();

		return ResponseEntity.ok(response);
	}

}
