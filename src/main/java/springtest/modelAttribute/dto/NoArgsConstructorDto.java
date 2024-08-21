package springtest.modelAttribute.dto;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
public class NoArgsConstructorDto {
    private String memberId;
    private Integer pw;

    @Override
    public String toString() {
        return "memberId='" + memberId + '\'' +
                ", pw=" + pw;
    }
}
