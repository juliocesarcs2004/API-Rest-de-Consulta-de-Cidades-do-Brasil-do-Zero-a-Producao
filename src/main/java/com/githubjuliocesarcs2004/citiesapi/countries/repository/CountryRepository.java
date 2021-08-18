package com.githubjuliocesarcs2004.citiesapi.countries.repository;

import com.githubjuliocesarcs2004.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
