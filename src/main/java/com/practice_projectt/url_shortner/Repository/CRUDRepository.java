package com.practice_projectt.url_shortner.Repository;

import com.practice_projectt.url_shortner.Model.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRUDRepository extends JpaRepository<UrlMapping, Integer> {
}
