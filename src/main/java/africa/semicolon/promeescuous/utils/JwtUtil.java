package africa.semicolon.promeescuous.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.security.core.GrantedAuthority;

import java.time.Instant;
import java.util.Collection;
import java.util.List;

import static africa.semicolon.promeescuous.utils.AppUtil.APP_NAME;

public class JwtUtil {

<<<<<<< HEAD
    public static String generateToken(String email){
	    return JWT.create()
=======
    public static String generateVerificationToken(String email){
        String token = JWT.create()
>>>>>>> eb5c41c8c8d219dd8bd0220875a1f0978eba3560
                .withClaim("user", email)
                .withIssuer(APP_NAME)
                .withExpiresAt(Instant.now().plusSeconds(3600))
                .sign(Algorithm.HMAC512("secret"));
    }

    public static String generateAccessToken(List<String> authorities){
        String token = JWT.create()
                .withClaim("roles", authorities)
                .withIssuer(APP_NAME)
                .withExpiresAt(Instant.now().plusSeconds(3600*24))
                .sign(Algorithm.HMAC512("secret"));
        return token;
    }

    public static boolean isValidJwt(String token){
        JWTVerifier verifier = JWT.require(Algorithm.HMAC512("secret"))
                .withIssuer(APP_NAME)
                .withClaimPresence("user")
                .build();
        return verifier.verify(token)!=null;
    }

    public static String extractEmailFrom(String token){
        var claim = JWT.decode(token).getClaim("user");
        return (String) claim.asMap().get("user");
    }
}
