package net.ismailtosun.Webpage_Spring.repository;

import net.ismailtosun.Webpage_Spring.models.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ContactFormRepository extends JpaRepository<ContactForm, Integer> {
}
