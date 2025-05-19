package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface INinjaRepository extends JpaRepository<NinjaModel, Long> {
}
