package com.frozan.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;


@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.frozan")
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

	/*@Bean(name = "viewResolver")
		public ViewResolver viewResolver() {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setViewClass(JstlView.class);
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			return viewResolver;
		}*/

	
/*	@Bean(name = "tilesConfigurer")
	public ViewResolver tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new org.springframework.web.servlet.view.tiles3.TilesConfigurer();
		tilesConfigurer.setDefinitions("definitions");
		tilesConfigurer.
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/
	
	
	/* @Bean
	    TilesConfigurer tilesConfigurer(){
	        TilesConfigurer tilesConfigurer = new TilesConfigurer();
	        tilesConfigurer.setDefinitions("/WEB-INF/layouts/tiles.xml");
	        tilesConfigurer.setPreparerFactoryClass(org.springframework.web.servlet.view.tiles3.SpringBeanPreparerFactory.class);
	        return tilesConfigurer;    
	    }
	  @Bean
	  UrlBasedViewResolver tilesViewResolver(){
		  UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		  viewResolver.setViewClass(TilesView.class);
	        return viewResolver;
	    }
*/
	
	/*@Bean(name = "viewResolver")
    public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(TilesView.class);
        return resolver;
    }

    @Bean
    public TilesConfigurer getTilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setCheckRefresh(true);
        tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/tiles.xml" });
        return tilesConfigurer;
    }
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}*/
	
	
	@Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  registry.addResourceHandler("/**").addResourceLocations("/");
	 }

	@Override
	 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	  configurer.enable();
	 }

	@Bean
	 public TilesViewResolver getTilesViewResolver() {
	  TilesViewResolver tilesViewResolver = new TilesViewResolver();
	  tilesViewResolver.setViewClass(TilesView.class);
	  return tilesViewResolver;
	 }
	
	@Bean
	 public TilesConfigurer getTilesConfigurer() {
	  TilesConfigurer tilesConfigurer = new TilesConfigurer();
	  tilesConfigurer.setCheckRefresh(true);
	  tilesConfigurer.setDefinitionsFactoryClass(TilesDefinitionsConfig.class);
	  
	  // Add apache tiles definitions
	  TilesDefinitionsConfig.addDefinitions();
	  
	  return tilesConfigurer;
	}
	
}
