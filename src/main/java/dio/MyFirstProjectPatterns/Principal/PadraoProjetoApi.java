package dio.MyFirstProjectPatterns.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadraoProjetoApi {
    public static void main(String[] args) {

        SpringApplication.run(PadraoProjetoApi.class, args);
    }
}
