package platform.user.auth.token;

import org.springframework.stereotype.Component;

@Component
public class TokenGenerator {


    private Long sessionLength;

    public SessionToken createToken(String userId) {

        return new SessionToken(userId, sessionLength);
    }

}
