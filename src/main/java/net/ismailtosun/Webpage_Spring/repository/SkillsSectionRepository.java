package net.ismailtosun.Webpage_Spring.repository;

import net.ismailtosun.Webpage_Spring.models.SkillsSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface SkillsSectionRepository extends JpaRepository<SkillsSection, Integer> {

    @Query("from SkillsSection where lang = ?1")
    public SkillsSection findByLang(String lang);
}
