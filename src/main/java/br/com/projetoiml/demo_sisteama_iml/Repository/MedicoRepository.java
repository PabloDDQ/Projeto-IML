package br.com.projetoiml.demo_sisteama_iml.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projetoiml.demo_sisteama_iml.Model.*;
public interface MedicoRepository extends JpaRepository<MedicoModel, String> {
    
}
