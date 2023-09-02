package africa.semicolon.promeescuous.services;
import africa.semicolon.promeescuous.dtos.requests.NotificationRequest;
import africa.semicolon.promeescuous.dtos.responses.NotificationResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
@Slf4j
@Sql(scripts = {"/db/insert.sql"})
public class NotificationServiceTest {
    @Autowired
    private NotificationService notificationService;

    @Test
    public void testThatWeCanSendANotification(){
        NotificationRequest notificationRequest = new NotificationRequest();
        notificationRequest.setRecipients_id(504L);
        notificationRequest.setSender_id(500L);
        notificationRequest.setSubject("notification sent");

        NotificationResponse response = notificationService.sendNotification(notificationRequest);

        assertThat(response).isNotNull();
        assertNotNull(response.getMessage());
    }
}
