package HomeOnTheGo.HomeOnTheGo;

import HomeOnTheGo.HomeOnTheGo.Model.Host;
import HomeOnTheGo.HomeOnTheGo.Model.Property;
import HomeOnTheGo.HomeOnTheGo.Model.User;
import HomeOnTheGo.HomeOnTheGo.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeToGoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeToGoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(UserRepository userRepository, PropertyRepository propertyRepository) {
//        return args -> {
//            User jared = User.builder()
//                    .firstName("Jared")
//                    .lastName("Martinez")
//                    .email("jaredmtz53@icloud.com")
//                    .build();
//
//            Host host = Host.builder()
//                    .hostBio("Treehouse")
//                    .user(jared)
//                    .build();
//            jared.setHost(host);
//            userRepository.save(jared);
//
//            Property cabin = Property.builder()
//                    .title("Mountain Cabin")
//                    .host(jared.getHost()) // link it to existing host
//                    .build();
//
//// bookings list starts empty due to @Builder.Default
//            propertyRepository.save(cabin);
//        };
//    }

}
