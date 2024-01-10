package com.mateus.droidregister.repository;

import com.mateus.droidregister.model.Lavagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LavagensRepository extends JpaRepository<Lavagem, UUID> {

    boolean existsByDataAndHora(String data, String hora);

}
