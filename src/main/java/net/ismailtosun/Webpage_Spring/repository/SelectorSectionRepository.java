package net.ismailtosun.Webpage_Spring.repository;

import net.ismailtosun.Webpage_Spring.models.SelectorSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SelectorSectionRepository extends JpaRepository<SelectorSection, Integer> {

    @Query("from SelectorSection where lang = ?1")
    public SelectorSection findByLang(String lang);
}
