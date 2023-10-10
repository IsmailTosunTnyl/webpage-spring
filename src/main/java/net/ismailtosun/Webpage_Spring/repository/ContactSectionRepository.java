package net.ismailtosun.Webpage_Spring.repository;

import net.ismailtosun.Webpage_Spring.models.ContactSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface ContactSectionRepository extends JpaRepository<ContactSection, Integer> {

    @Query("SELECT c FROM ContactSection c WHERE c.lang = ?1")
    public ContactSection findByLang(String lang);
}
