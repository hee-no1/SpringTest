package springtest.requestBody.controller;

import org.springframework.web.bind.annotation.*;
import springtest.dto.*;


@RestController
@RequestMapping(value = "/requestbody")
public class RequestBodyController {

    @PostMapping("/noargsconstructor")
    public String noArgsConstructorTest(@RequestBody NoArgsConstructorDto noArgsConstructorDto) {
        System.out.println("noArgsConstructorDto = " + noArgsConstructorDto);
        return noArgsConstructorDto.toString();
    }

    @PostMapping( "/getter")
    public String getterTest(@RequestBody GetterDto getterDto) {
        System.out.println("getterDto = " + getterDto);
        return getterDto.toString();
    }

    @PostMapping( "/setter")
    public String setterTest(@RequestBody SetterDto setterDto) {
        System.out.println("setterDto = " + setterDto);
        return setterDto.toString();
    }

    @PostMapping( "/noargsconstructor-getter")
    public String noArgsConstructorGetterTest(@RequestBody NoArgsConstructorGetterDto noArgsConstructorGetterDto) {
        System.out.println("noArgsConstructorGetterDto = " + noArgsConstructorGetterDto);
        return noArgsConstructorGetterDto.toString();
    }

    @PostMapping( "/noargsconstructor-setter")
    public String noArgsConstructorSetterTest(@RequestBody NoArgsConstructorSetterDto noArgsConstructorSetterDto) {
        System.out.println("noArgsConstructorSetterDto = " + noArgsConstructorSetterDto);
        return noArgsConstructorSetterDto.toString();
    }

    @PostMapping("allargsconstructor")
    public String allArgsConstructorTest(@RequestBody AllArgsConstructorDto allArgsConstructorDto){
        System.out.println("allArgsConstructorDto = " + allArgsConstructorDto);
        return allArgsConstructorDto.toString();
    }
}
