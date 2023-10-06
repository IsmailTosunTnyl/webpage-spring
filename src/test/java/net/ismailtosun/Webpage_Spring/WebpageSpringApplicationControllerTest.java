package net.ismailtosun.Webpage_Spring;

import net.ismailtosun.Webpage_Spring.dao.TopSectionRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@TestPropertySource("/application-test.properties")
@AutoConfigureMockMvc
@SpringBootTest
public class WebpageSpringApplicationControllerTest {


    private static MockHttpServletRequest request;

    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private TopSectionRepository topSectionRepository;

    @Value("${sql.script.create.topsection}")
    private String sqlAddTopSection;

    @Autowired
    private MockMvc mockMvc;


    @BeforeAll
    static void setUpAll() {
        request = new MockHttpServletRequest();
    }

    @BeforeEach
    void setUp() {
        jdbc.execute(sqlAddTopSection);
    }

    @Test
    void placeholder() {

    }

    // get alldata tests

    @Test
    void getAlldataHttpRequest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.topSection.lang").value("en"));

        // add parameter to request


        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata")
                        .header("Accept-Language", "tr"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.topSection.lang").value("tr"));
    }
}
