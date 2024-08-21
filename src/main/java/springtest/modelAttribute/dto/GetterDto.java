package springtest.modelAttribute.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
public class GetterDto {
    private String memberId;
    private Integer pw;

    @Override
    public String toString() {
        return "memberId='" + memberId + '\'' +
                ", pw=" + pw;
    }
}
