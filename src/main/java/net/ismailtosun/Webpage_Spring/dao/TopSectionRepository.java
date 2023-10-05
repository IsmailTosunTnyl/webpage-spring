package net.ismailtosun.Webpage_Spring.dao;

import net.ismailtosun.Webpage_Spring.Models.TopSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TopSectionRepository extends JpaRepository<TopSection,Integer> {
}
