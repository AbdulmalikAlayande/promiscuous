
package africa.semicolon.promeescuous.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class AppConfig {
    @Value("${mail.api.key}")
    private String mailApiKey;

    @Value("${app.dev.token}")
    private String testToken;

    @Value("${app.base.url}")
    private String baseUrl;

    @Value("${cloud.api.name}")
    private String cloudName;


    @Value("${cloud.api.secret}")
    private String cloudSecret;

    @Value("${cloud.api.key}")
    private String cloudApiKey;
    
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
    @Bean
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }
    
    public String getMailApiKey() {
        return mailApiKey;
    }

    public String getTestToken(){
        return testToken;
    }

    public String getBaseUrl(){
        return baseUrl;
    }

    public String getCloudName(){
        return cloudName;
    }

    public String getCloudSecret(){
        return cloudSecret;
    }

    public String getCloudApiKey(){
        return cloudApiKey;
    }


}
