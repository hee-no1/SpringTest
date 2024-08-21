package springtest.modelAttribute.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
public class NoArgsConstructorSetterDto {
    private String memberId;
    private Integer pw;

    @Override
    public String toString() {
        return "memberId='" + memberId + '\'' +
                ", pw=" + pw;
    }
}
