package springtest.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
public class AllArgsConstructorDto {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
