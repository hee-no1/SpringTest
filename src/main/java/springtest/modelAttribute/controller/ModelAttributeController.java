package springtest.modelAttribute.controller;

import org.springframework.web.bind.annotation.*;
import springtest.modelAttribute.dto.*;

@RestController
@RequestMapping("/modelattribute")
public class ModelAttributeController {

    @PostMapping("/noargsconstructor")
    public String noArgsConstructorTest(@ModelAttribute NoArgsConstructorDto noArgsConstructorDto) {
        return noArgsConstructorDto.toString();
    }

    @PostMapping( "/getter")
    public String getterTest(@ModelAttribute GetterDto getterDto) {
        return getterDto.toString();
    }

    @PostMapping( "/setter")
    public String setterTest(@ModelAttribute SetterDto setterDto) {
        return setterDto.toString();
    }

    @PostMapping( "/noargsconstructor-getter")
    public String noArgsConstructorGetterTest(@ModelAttribute NoArgsConstructorGetterDto noArgsConstructorGetterDto) {
        return noArgsConstructorGetterDto.toString();
    }

    @PostMapping( "/noargsconstructor-setter")
    public String noArgsConstructorSetterTest(@ModelAttribute NoArgsConstructorSetterDto noArgsConstructorSetterDto) {
        return noArgsConstructorSetterDto.toString();
    }

    @PostMapping("allargsconstructor")
    public String allArgsConstructorTest(@ModelAttribute AllArgsConstructorDto allArgsConstructorDto){
        return allArgsConstructorDto.toString();
    }
}
