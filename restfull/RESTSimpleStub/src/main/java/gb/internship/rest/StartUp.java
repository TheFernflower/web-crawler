package gb.internship.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Класс для запуска приложения.
 *
 * @author Aleksandr Vvedensky
 */
@SpringBootApplication
@EnableWebMvc
@Configuration
//@ComponentScan(basePackages = "gb.internship.rest.requestcontrollers")
//@ComponentScan(basePackages = {"gb.internship.rest.requestcontrollers",
//        "gb.internship.rest.security",
//        "gb.internship.rest.webpagecontroller"})
@ComponentScan(basePackages = "gb.internship.rest")
//webpagecontroller
//@ComponentScan(basePackages = "gb.internship.rest.webpagecontroller")
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }
}
