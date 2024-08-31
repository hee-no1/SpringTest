package springtest.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BuilderPattenTest {

    @Test
    public void builderPatten(){
        Airplane airplane1 = Airplane.builder()
                .airplaneId(1L)
                .airplaneType("보잉777")
                .capacity(100)
                .state("Y")
                .build();

        System.out.println("airplane1 = " + airplane1);

        Airplane airplane2 = Airplane.builder()
                .airplaneType("보잉888")
                .capacity(100)
                .build();

        System.out.println("airplane2 = " + airplane2);

    }
}