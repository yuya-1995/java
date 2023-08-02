package app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

	//ルーティング？
	@GetMapping("/next.html")
	public String next() {
		return "next";
	}

	//POST送信
	@PostMapping("/processForm")
    public String processForm(String inputText, Model model) {
        // POSTリクエストからinputTextの値を受け取り、モデルにセット
        model.addAttribute("inputText", inputText);
		System.out.println(inputText); //デバッグ
        return "output"; // 結果を表示するテンプレート名
    }

}
