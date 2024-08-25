package springtest.modelAttribute.controller;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springtest.dto.*;

@RestController
@RequestMapping("/modelattribute")
public class ModelAttributeController {

    @PostMapping( "/noargsconstructor")
    public String noArgsConstructorTest(@ModelAttribute NoArgsConstructorDto noArgsConstructorDto) {
        System.out.println("noArgsConstructorDto = " + noArgsConstructorDto);
        return noArgsConstructorDto.toString();
    }

    @PostMapping(  "/getter")
    public String getterTest(@ModelAttribute GetterDto getterDto) {
        System.out.println("getterDto = " + getterDto);
        return getterDto.toString();
    }

    @PostMapping(  "/setter")
    public String setterTest(@ModelAttribute SetterDto setterDto) {
        System.out.println("setterDto = " + setterDto);
        return setterDto.toString();
    }

    @PostMapping( "/noargsconstructor-getter")
    public String noArgsConstructorGetterTest(@ModelAttribute NoArgsConstructorGetterDto noArgsConstructorGetterDto) {
        System.out.println("noArgsConstructorGetterDto = " + noArgsConstructorGetterDto);
        return noArgsConstructorGetterDto.toString();
    }

    @PostMapping( "/noargsconstructor-setter")
    public String noArgsConstructorSetterTest(@ModelAttribute NoArgsConstructorSetterDto noArgsConstructorSetterDto) {
        System.out.println("noArgsConstructorSetterDto = " + noArgsConstructorSetterDto);
        return noArgsConstructorSetterDto.toString();
    }

    @PostMapping("allargsconstructor")
    public String allArgsConstructorTest(@ModelAttribute AllArgsConstructorDto allArgsConstructorDto){
        System.out.println("allArgsConstructorDto = " + allArgsConstructorDto);
        return allArgsConstructorDto.toString();
    }

}
