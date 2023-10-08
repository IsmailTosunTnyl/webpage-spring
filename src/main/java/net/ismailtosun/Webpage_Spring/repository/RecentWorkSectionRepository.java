package net.ismailtosun.Webpage_Spring.repository;

import net.ismailtosun.Webpage_Spring.models.RecentWorkSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RecentWorkSectionRepository extends JpaRepository<RecentWorkSection, Integer> {

    @Query("from RecentWorkSection where lang = ?1")
    public RecentWorkSection findByLang(String lang);
}
