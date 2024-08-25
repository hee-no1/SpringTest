package springtest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
public class SetterDto {
    private String name;
    private Integer age;

    public SetterDto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
