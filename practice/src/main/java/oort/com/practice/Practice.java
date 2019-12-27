package oort.com.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List ;

@RestController
public class Practice {
    @RequestMapping("/Wellcome")
    public List<String> Hey()
    {
        List<String> list = new ArrayList<>() ;
        list.add("Suhel");
        list.add("Sam Zin");
        return list;
    }
}
