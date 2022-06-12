package social.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import social.user.dto.SocialUserDto;

@Slf4j
@RestController
@RequestMapping(path = "${rest.api.prefix}")
public class SocialUserController {

	private static final List<SocialUserDto> socialUserDtos = new ArrayList<>();
	static {
		for (int i = 1; i <= 10; i++) {
			socialUserDtos.add(SocialUserDto.builder().id(Long.valueOf(i)).name("name " + i).contact(i)
					.email("email" + i + "@gmail.com").address("city" + i).build());
		}
	}

	@GetMapping(path = "/get", produces = "application/json")
	public List<SocialUserDto> getUsers() {
		log.info("Get User call starts...");
		return socialUserDtos;
	}

	@PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
	public void addUser(@RequestBody SocialUserDto socialUserDto) {
		socialUserDtos.add(socialUserDto);
	}

}
