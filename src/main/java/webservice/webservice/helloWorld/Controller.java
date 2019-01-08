package webservice.webservice.helloWorld;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping(path="/hello-world-bean/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello world Bean  ,%s",name));
    }
}

