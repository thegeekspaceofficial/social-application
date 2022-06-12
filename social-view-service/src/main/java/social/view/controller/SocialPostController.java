package social.view.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import social.view.dto.SocialPostDto;

@RestController
@RequestMapping(path = "${rest.api.prefix}/posts")
public class SocialPostController {

	private static final List<SocialPostDto> socialPostDtos = new ArrayList<>();
	static {
		for (int i = 1; i <= 10; i++) {
			socialPostDtos.add(SocialPostDto.builder().id(Long.valueOf(i)).post("POST" + i).build());
		}
	}

	@GetMapping(path = "/get", produces = "application/json")
	public List<SocialPostDto> getPost() {
		return socialPostDtos;
	}

	@PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
	public void addPost(@RequestBody SocialPostDto socialPostDto) {
		socialPostDtos.add(socialPostDto);

	}
}
