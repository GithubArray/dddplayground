package se.citerus.dddsample.interfaces.playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/playground")
public class PlaygroundController {

    @Autowired
    private final PlaygroundService playgroundService;

    public PlaygroundController(PlaygroundService playgroundService) {
        this.playgroundService = playgroundService;
    }

    @GetMapping("echo")
    public ResponseEntity<?> echo(@RequestParam Map<String, String> params) {
        String messageToEcho = params.get("messageToEcho");
        return ResponseEntity.ok(playgroundService.echo(messageToEcho));
    }

    @GetMapping("multiplyByTwo")
    public ResponseEntity<?> multiplyByTwo(@RequestParam Map<String, String> params) {
        int numberToMultiply = 0;
        try {
            numberToMultiply = Integer.parseInt(params.get("numberToMultiply"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(playgroundService.multiplyByTwo(numberToMultiply));
    }
}
