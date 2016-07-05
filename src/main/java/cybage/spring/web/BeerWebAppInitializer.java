package cybage.spring.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import cybage.spring.configurtion.ApplicationConfig;
import cybage.spring.configurtion.AspectConfig;
import cybage.spring.configurtion.SecurityConfig;
import cybage.spring.configurtion.WebApplicationConfig;

public class BeerWebAppInitializer extends  AbstractAnnotationConfigDispatcherServletInitializer  {


	@Override
	protected String[] getServletMappings() {
		return  new String[] { "/myapp/*" };
	}


	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationConfig.class, AspectConfig.class, SecurityConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebApplicationConfig.class };
	}

 }