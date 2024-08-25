package springtest.requestBody.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RequestBodyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("기본생성자만 있는 경우")
    public void noArgsConstructorTest() throws Exception {
        mockMvc.perform(post("/requestbody/noargsconstructor")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"name\":\"admin\", \"age\":\"20\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("name='admin', age=20"));

    }

    @Test
    @DisplayName("Getter만 있는 경우")
    public void GetterTest() throws Exception {
        mockMvc.perform(post("/requestbody/getter")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"name\":\"admin\", \"age\":\"20\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("name='admin', age=20"));

    }

    @Test
    @DisplayName("Setter만 있는 경우")
    public void SetterTest() throws Exception {
        mockMvc.perform(post("/requestbody/setter")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"name\":\"admin\", \"age\":\"20\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("name='admin', age=20"));

    }

    @Test
    @DisplayName("기본생성자 & Getter 있는 경우")
    public void noArgsConstructorGetterTest() throws Exception {
        mockMvc.perform(post("/requestbody/noargsconstructor-getter")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"name\":\"admin\", \"age\":\"20\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("name='admin', age=20"));
    }

    @Test
    @DisplayName("기본생성자 & Setter 있는 경우")
    public void noArgsConstructorSetterTest() throws Exception {
        mockMvc.perform(post("/requestbody/noargsconstructor-setter")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"name\":\"admin\", \"age\":\"20\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("name='admin', age=20"));
    }

    @Test
    @DisplayName("allArgs 생성자만 있는 경우")
    public void allArgsConstructorTest() throws Exception {
        mockMvc.perform(post("/requestbody/allargsconstructor")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content("{\"name\":\"admin\", \"age\":\"20\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("name='admin', age=20"));
    }
}