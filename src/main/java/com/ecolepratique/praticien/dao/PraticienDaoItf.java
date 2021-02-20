package com.ecolepratique.praticien.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.praticien.entite.Praticien;

public interface PraticienDaoItf extends JpaRepository <Praticien, Long>{
	Praticien findByNom(String nom);
	
}
