package br.com.projetoiml.demo_sisteama_iml.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoiml.demo_sisteama_iml.Model.AgendaModel;

public interface AgendaRepository extends JpaRepository<AgendaModel, String>{

    
}
