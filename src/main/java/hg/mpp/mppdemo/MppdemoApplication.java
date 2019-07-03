package hg.mpp.mppdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class MppdemoApplication {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(MppdemoApplication.class, args);
    }

}
