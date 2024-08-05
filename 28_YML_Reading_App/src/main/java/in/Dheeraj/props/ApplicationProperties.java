package in.Dheeraj.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "dheeraj")
public class ApplicationProperties {

	private Map<String, String> messages = new HashMap<>();
	
	
}
