package br.com.adpmnet.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.adpmnet.controllers.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver () {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".html");
		return resolver;
	}
	
	@Override
	public void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
}
