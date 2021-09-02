package com.ecommerce.NutriCommunity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.NutriCommunity.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria>findAllByNomeOngContainingIgnoreCase(String nomeOng);
}
