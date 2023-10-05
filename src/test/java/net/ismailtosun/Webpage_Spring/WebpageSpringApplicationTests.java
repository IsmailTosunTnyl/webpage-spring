package net.ismailtosun.Webpage_Spring;

import net.ismailtosun.Webpage_Spring.Models.TopSection;
import net.ismailtosun.Webpage_Spring.dao.TopSectionRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@TestPropertySource("/application-test.properties")
@SpringBootTest
class WebpageSpringApplicationTests {




	@Autowired
	private JdbcTemplate jdbc;

	@Autowired
	private TopSectionRepository topSectionRepository;

	@Value("${sql.script.create.topsection}")
	private String sqlAddTopSection;
	@Test void placeholder(){

	}


	@Test
	void topsectionLanguageTest() {

		TopSection topSection = topSectionRepository.findById(2).get();
		assertEquals("en", topSection.getLang(),"The language is must be en");
		assertNotEquals("en", topSection.getLang(), "The language is must be en");
	}
	@BeforeEach
	void setUp() {
		jdbc.execute(sqlAddTopSection);
	}
	@AfterEach
	void tearDown() {
		jdbc.execute("DELETE FROM top_section_table");
	}
}
