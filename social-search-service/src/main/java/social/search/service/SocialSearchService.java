package social.search.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import social.search.dto.SocialSearchDto;
import social.search.dto.SocialSearchUserResponseDto;

@RestController
@RequestMapping(path = "/search")
public class SocialSearchService {

	@GetMapping(path = "/", produces = "application/json")
	public SocialSearchDto search(@PathVariable("searchKey") String searchKey) {
		return SocialSearchDto.builder().searchId(123L).searchKey(searchKey).searchResult("Data found").build();
	}

	@GetMapping(path = "/byUsername", produces = "application/json")
	public SocialSearchUserResponseDto searchByUsername(@PathVariable("searchKey") String searchKey) {
		return null;
	}

}
