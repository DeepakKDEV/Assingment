package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiBilli {
   @Autowired
    Billi obj;

   @GetMapping("pathfor/Geetster")
   public String Api1(){
       return "hello_geekster";
   }
   @GetMapping("catdata")
   public Billi getdata(){

       return obj;
   }
   @GetMapping("CatData2")

   public Billi getnew(){
       return obj;
   }
   @PutMapping("api/color")
    public String setColor()
    {
        obj.setColor("red");
        return "colour changed";
    }

}
