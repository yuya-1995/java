// package app.demo;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DemoApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(DemoApplication.class, args);
// 	}

// }

package app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // このクラスを Controller にする
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    // Getリクエストがルートパスに来たときのController
	@GetMapping("/")
	public String helloWorld() {
		return "index"; // src/main/resources/templates/index.html をレンダリングして返す
	}

}
