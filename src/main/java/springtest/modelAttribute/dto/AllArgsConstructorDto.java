package springtest.modelAttribute.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
public class AllArgsConstructorDto {
    private String memberId;
    private Integer pw;

    @Override
    public String toString() {
        return "memberId='" + memberId + '\'' +
                ", pw=" + pw;
    }
}
