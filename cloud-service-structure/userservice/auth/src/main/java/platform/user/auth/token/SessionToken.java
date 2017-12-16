package platform.user.auth.token;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class SessionToken {

    @Id
    private UUID value;
    private String userId;
    private Long sessionLength;

    public SessionToken() {

    }

    public SessionToken(String userId, Long sessionLength) {
        this.value = UUID.randomUUID();
        this.userId = userId;
        this.sessionLength = sessionLength;
    }


    public String getValue() {
        return value.toString();
    }

    public String getUserId() {
        return userId;
    }

}
