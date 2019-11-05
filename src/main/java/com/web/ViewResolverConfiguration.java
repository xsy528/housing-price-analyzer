//package com.web;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.com.web.servlet.ViewResolver;
//import org.springframework.com.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.com.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.com.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.com.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.com.web.servlet.view.InternalResourceViewResolver;
//
///**
// * 主要配置多视图实现的视图解析器相关bean实例
// *
// * 其实关键点在于两个：
// * 1、配置order属性
// * 2、配置viewnames属性
// *
// * 注意：
// * return new ModelAndView("jsps/index");//或者return "jsps/index"
// * 对应 /WEB-INF/jsps/index.jsp
// * ==========================
// * 同理：
// * return "thymeleaf/index";//或者return “thymeleaf/index”
// * 对应 /WEB-INF/thymeleaf/index.html
// *
// *
// */
//@Configuration
//public class ViewResolverConfiguration {
//    @Configuration//用来定义 DispatcherServlet 应用上下文中的 bean
//    @EnableWebMvc
//    @ComponentScan("com")
//    public class WebConfig extends WebMvcConfigurerAdapter {
//        @Bean
//        public ViewResolver viewResolver() {
//            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//            resolver.setPrefix("/WEB-INF/views/");
//            resolver.setSuffix(".jsp");
//            resolver.setViewNames("*");
////            resolver.setPrefix("/");
////            resolver.setSuffix(".jsp");
////            resolver.setViewNames("jsps/*");
//            resolver.setOrder(2);
//            return resolver;
//        }
////        @Bean
////        public ITemplateResolver templateResolver() {
////            SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
////            templateResolver.setTemplateMode("HTML5");
////            templateResolver.setPrefix("/templates/");
////            templateResolver.setSuffix(".html");
////            templateResolver.setCharacterEncoding("utf-8");
////            templateResolver.setCacheable(false);
////            return templateResolver;
////        }
////        @Bean
////        public SpringTemplateEngine templateEngine() {
////            SpringTemplateEngine templateEngine = new SpringTemplateEngine();
////            templateEngine.setTemplateResolver(templateResolver());
////            // templateEngine
////            return templateEngine;
////        }
////        @Bean
////        public ThymeleafViewResolver viewResolverThymeLeaf() {
////            ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
////            viewResolver.setTemplateEngine(templateEngine());
////            viewResolver.setCharacterEncoding("utf-8");
////            viewResolver.setOrder(1);
////            //viewResolver.setViewNames(new String[]{"thyme/*"});
////            viewResolver.setViewNames(new String[]{"thymeleaf/*","vue/*"});
////            return viewResolver;
////        }
//        @Override
//        public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//            configurer.enable();
//        }
//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            super.addResourceHandlers(registry);
//        }
//    }
//}
