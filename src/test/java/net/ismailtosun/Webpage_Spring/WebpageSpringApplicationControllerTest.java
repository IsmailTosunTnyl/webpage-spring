package net.ismailtosun.Webpage_Spring;

import net.ismailtosun.Webpage_Spring.repository.TopSectionRepository;
import org.junit.jupiter.api.*;
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

    @Value("${sql.script.create.aboutsection}")
    private String sqlAddAboutSection;

    @Value("${sql.script.create.selectorsection}")
    private String sqlAddSelectorSection;

    @Value("${sql.script.create.skillssection}")
    private String sqlAddSkillsSection;

    @Value("${sql.script.create.contactsection}")
    private String sqlAddContactSection;


    @Autowired
    private MockMvc mockMvc;


    @BeforeAll
    static void setUpAll() {
        request = new MockHttpServletRequest();
    }

    @BeforeEach
    void setUp() {
        jdbc.execute(sqlAddTopSection);
        jdbc.execute(sqlAddAboutSection);
        jdbc.execute(sqlAddSelectorSection);
        jdbc.execute(sqlAddSkillsSection);
        jdbc.execute(sqlAddContactSection);
    }

    @AfterEach
    void tearDown() {
        jdbc.execute("DELETE FROM top_section_table");
        jdbc.execute("DELETE FROM about_section_table");
        jdbc.execute("DELETE FROM selector_section_table");
        jdbc.execute("DELETE FROM skills_section_table");
        jdbc.execute("DELETE FROM contact_section_table");
    }

    @Test
    void placeholder() {

    }

    // get alldata tests

    @Test
    @DisplayName("getAllData TopSection HTTP Request")
    void getAlldataHttpRequestTopSection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.topSection.lang").value("en"));


        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata")
                        .header("Accept-Language", "tr"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.topSection.lang").value("tr"));
    }


    @Test
    @DisplayName("getAllData AboutSection HTTP Request")
    void getAlldataHttpRequestAboutSection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.aboutSection.lang").value("en"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata")
                        .header("Accept-Language", "tr"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.aboutSection.lang").value("tr"));
    }

    @Test
    @DisplayName("getAllData SelectorSection HTTP Request")
    void getAlldataHttpRequestSelectorSection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.selectorSection.lang").value("en"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata")
                        .header("Accept-Language", "tr"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.selectorSection.lang").value("tr"));
    }

    @Test
    @DisplayName("getAllData SkillsSection HTTP Request")
    void getAlldataHttpRequestSkillsSection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.skillsSection.lang").value("en"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata")
                        .header("Accept-Language", "tr"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.skillsSection.lang").value("tr"));
    }

    @Test
    @DisplayName("getAllData ContactSection HTTP Request")
    void getAlldataHttpRequestContactSection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.contactSection.lang").value("en"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/webpage/alldata")
                        .header("Accept-Language", "tr"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.contactSection.lang").value("tr"));
    }

    @Test
    @DisplayName("Post ContactForm HTTP Request")
    void postContactFormHttpRequest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .post("/api/webpage/contactform").content("{\"contactName\":\"testName\",\"contactEmail\":\"testEmail\",\"contactMessage\":\"testMessage\"}")
                .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.contactName").value("testName"))
                .andExpect(jsonPath("$.contactEmail").value("testEmail"))
                .andExpect(jsonPath("$.contactMessage").value("testMessage"));
    }

}
