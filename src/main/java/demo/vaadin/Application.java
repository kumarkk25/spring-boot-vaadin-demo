package demo.vaadin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="demo")
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(Application.class).web(true)
				.logStartupInfo(true).run(args);
	}
}
