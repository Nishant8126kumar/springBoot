package com.example.crud.SecondCrudDemo.repository;

import com.example.crud.SecondCrudDemo.model.Cetrtificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Cetrtificate,Long> {
}
