package com.empresa.SistemaBancario.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

 @Override
 public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**")
             .allowedOrigins("http://localhost:3000") // Permitir solicitudes desde este origen
             .allowedMethods("GET", "POST", "PUT", "DELETE");
 }

 // Puedes agregar configuraciones adicionales aquí si es necesario

 // Ejemplo de configuración de un bean
 // @Bean
 // public MiBeanPersonalizado miBeanPersonalizado() {
 //     return new MiBeanPersonalizado();
 // }
}
