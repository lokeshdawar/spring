//package org.lucksoft.init;
//
//import org.lucksoft.config.ApplicationConfig;
//import org.lucksoft.config.DBConfig;
//import org.lucksoft.config.WebConfig;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//	
//	private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		logger.info(getServletName());
//		return new Class[] {ApplicationConfig.class,DBConfig.class};
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		logger.error("i am here");
//		return new Class[] {WebConfig.class};
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] {"/"};
//	}
//
//}
