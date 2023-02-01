package com.example.Intro.PRCompany.repositories;

import com.example.Intro.PRCompany.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
