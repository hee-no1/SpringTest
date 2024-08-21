package springtest.modelAttribute.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
public class SetterDto {
    private String memberId;
    private Integer pw;

    @Override
    public String toString() {
        return "memberId='" + memberId + '\'' +
                ", pw=" + pw;
    }
}
