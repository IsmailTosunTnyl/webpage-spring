package net.ismailtosun.Webpage_Spring.repository;

import net.ismailtosun.Webpage_Spring.models.AboutSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface AboutSectionRepository extends JpaRepository<AboutSection, Integer> {

    @Query("from AboutSection where lang like %?1%")
    public AboutSection findByLang(String lang);
}
