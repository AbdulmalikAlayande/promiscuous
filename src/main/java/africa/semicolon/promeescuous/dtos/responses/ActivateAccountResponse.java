package africa.semicolon.promeescuous.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivateAccountResponse {
	
	private String message;
	private GetUserResponse user;
}
