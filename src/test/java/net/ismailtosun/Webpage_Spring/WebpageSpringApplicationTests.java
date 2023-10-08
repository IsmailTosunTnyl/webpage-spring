package net.ismailtosun.Webpage_Spring;

import net.ismailtosun.Webpage_Spring.models.AboutSection;
import net.ismailtosun.Webpage_Spring.models.SelectorSection;
import net.ismailtosun.Webpage_Spring.models.TopSection;
import net.ismailtosun.Webpage_Spring.repository.AboutSectionRepository;
import net.ismailtosun.Webpage_Spring.repository.SelectorSectionRepository;
import net.ismailtosun.Webpage_Spring.repository.TopSectionRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

	@Autowired
	private AboutSectionRepository aboutSectionRepository;

	@Autowired
	private SelectorSectionRepository selectorSectionRepository;


	@Value("${sql.script.create.topsection}")
	private String sqlAddTopSection;

	@Value("${sql.script.create.aboutsection}")
	private String sqlAddAboutSection;

	@Value("${sql.script.create.selectorsection}")
	private String sqlAddSelectorSection;

	@Value("${sql.script.create.skillssection}")
	private String sqlAddSkillsSection;
	@Test void placeholder(){

	}

	// TopSection Tests
	@Test
	@DisplayName("TopSection FindByID")
	void topsectionFinByID() {

		TopSection topSection = topSectionRepository.findById(2).get();
		assertEquals("en", topSection.getLang(),"The language is must be en");
		assertNotEquals("tr", topSection.getLang(), "The language is must be en");
	}

	@Test
	@DisplayName("TopSection FindByLang")
	void topsectionFindByLang() {
		TopSection topSectionEN = topSectionRepository.findByLang("en");
		TopSection topSectionTR = topSectionRepository.findByLang("tr");
		assertEquals("en", topSectionEN.getLang(),"The language is must be en");
		assertEquals("tr", topSectionTR.getLang(),"The language is must be tr");
		assertNotEquals("tr", topSectionEN.getLang(), "The language is must be en");
	}

	@Test
	@DisplayName("AboutSection FindByID")
	void aboutsectionFinByID() {

		AboutSection aboutSectionTR = aboutSectionRepository.findById(1).get();

		assertEquals("tr", aboutSectionTR.getLang(),"The language is must be tr");
	}

	@Test
	@DisplayName("AboutSection FindByLang")
	void aboutsectionFindByLang() {

		AboutSection aboutSectionTR = aboutSectionRepository.findByLang("tr");
		AboutSection aboutSectionEN = aboutSectionRepository.findByLang("en");

		assertEquals("tr", aboutSectionTR.getLang(),"The language is must be tr");
		assertEquals("en", aboutSectionEN.getLang(),"The language is must be en");
		assertNotEquals("en", aboutSectionTR.getLang(), "The language is must be tr");
	}

	@Test
	@DisplayName("SelectorSection FindByID")
	void selectorsectionFinByID() {

		SelectorSection selectorSectionTR = selectorSectionRepository.findById(1).get();

		assertEquals("tr", selectorSectionTR.getLang(),"The language is must be tr");
	}

	@Test
	@DisplayName("SelectorSection FindByLang")
	void selectorsectionFindByLang() {

		SelectorSection selectorSectionTR = selectorSectionRepository.findByLang("tr");
		SelectorSection selectorSectionEN = selectorSectionRepository.findByLang("en");

		assertEquals("tr", selectorSectionTR.getLang(),"The language is must be tr");
		assertEquals("en", selectorSectionEN.getLang(),"The language is must be en");
		assertNotEquals("en", selectorSectionTR.getLang(), "The language is must be tr");
	}

	@Test
	@DisplayName("SkillsSection FindByLang")
	void skillssectionFindByLang() {

		SelectorSection selectorSectionTR = selectorSectionRepository.findByLang("tr");
		SelectorSection selectorSectionEN = selectorSectionRepository.findByLang("en");

		assertEquals("tr", selectorSectionTR.getLang(),"The language is must be tr");
		assertEquals("en", selectorSectionEN.getLang(),"The language is must be en");
		assertNotEquals("en", selectorSectionTR.getLang(), "The language is must be tr");
	}

	@Test
	@DisplayName("SkillsSection FindByID")
	void skillssectionFinByID() {

		SelectorSection selectorSectionTR = selectorSectionRepository.findById(1).get();

		assertEquals("tr", selectorSectionTR.getLang(),"The language is must be tr");
	}

	@BeforeEach
	void setUp() {
		jdbc.execute(sqlAddTopSection);
		jdbc.execute(sqlAddAboutSection);
		jdbc.execute(sqlAddSelectorSection);
		jdbc.execute(sqlAddSkillsSection);
	}
	@AfterEach
	void tearDown() {
		jdbc.execute("DELETE FROM top_section_table");
		jdbc.execute("DELETE FROM about_section_table");
		jdbc.execute("DELETE FROM selector_section_table");
		jdbc.execute("DELETE FROM skills_section_table");
	}
}
