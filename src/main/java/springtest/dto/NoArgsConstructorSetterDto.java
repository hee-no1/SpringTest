package springtest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
public class NoArgsConstructorSetterDto {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
