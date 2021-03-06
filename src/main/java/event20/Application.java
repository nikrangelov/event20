package event20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by nik on 5/30/17.
 */

@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}