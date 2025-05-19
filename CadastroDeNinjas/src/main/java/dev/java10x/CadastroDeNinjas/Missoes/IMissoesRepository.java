package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IMissoesRepository extends JpaRepository<MissoesModel, Long> {
}
