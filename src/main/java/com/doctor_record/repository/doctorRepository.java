package com.doctor_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor_record.entities.doctor;

public interface doctorRepository extends JpaRepository<doctor, Long> {

}
