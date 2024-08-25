package springtest.dto;

import lombok.*;

@NoArgsConstructor
@Getter
public class NoArgsConstructorGetterDto {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
