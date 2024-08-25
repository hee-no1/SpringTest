package springtest.dto;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
public class NoArgsConstructorDto {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
