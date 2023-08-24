package africa.semicolon.promeescuous.dtos.requests;

import africa.semicolon.promeescuous.models.Reaction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeOrDislikeRequest {
    private Reaction reaction;
}