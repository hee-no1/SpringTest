package springtest.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Airplane {
    private Long airplaneId; //항공기 ID
    private String airplaneType; //항공기 종류
    private Integer capacity; //수용인원
    private String state; //상태

    public Airplane(Builder builder){
        this.airplaneId = builder.airplaneId;
        this.airplaneType = builder.airplaneType;
        this.capacity = builder.capacity;
        this.state = builder.state;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Long airplaneId;
        private String airplaneType;
        private Integer capacity;
        private String state;

        public Builder airplaneId(Long airplaneId){
            this.airplaneId = airplaneId;
            return this;
        }

        public Builder airplaneType(String airplaneType) {
            this.airplaneType = airplaneType;
            return this;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Airplane build(){
            return new Airplane(this);
        }
    }
}
