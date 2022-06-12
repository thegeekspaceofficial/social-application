package social.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialUserDto {

	private Long id;
	private String name;
	private String email;
	private Integer contact;
	private String address;

}
