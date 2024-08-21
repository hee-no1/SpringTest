package springtest.modelAttribute.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
public class NoArgsConstructorGetterDto {
    private String memberId;
    private Integer pw;

    @Override
    public String toString() {
        return "memberId='" + memberId + '\'' +
                ", pw=" + pw;
    }
}
