package com.mateus.droidregister.controller;

import com.mateus.droidregister.model.Lavagem;
import com.mateus.droidregister.repository.LavagensRepository;
import com.mateus.droidregister.service.FileReaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/lavagens")
public class LavagensController {

    private final LavagensRepository lavagensRepository;

    public LavagensController(LavagensRepository lavagensRepository) {
        this.lavagensRepository = lavagensRepository;
    }

    @GetMapping
    public List<Lavagem> listar() {
        return lavagensRepository.findAll();
    }

    @PostMapping("/processar-arquivo")
    public void processarArquivo() {
        FileReaderService fileReaderService = new FileReaderService();
//        String caminhoArquivo = "G:\\Meu Drive\\MacroDroid\\lg-lavaseca.txt";
        String caminhoArquivo = "C:\\Users\\mateu\\Downloads\\testdroidregister\\lg-lavaseca.txt";

        try {
            List<String> linhas = fileReaderService.lerArquivo(caminhoArquivo);

            for (String linha : linhas) {
                adicionar(linha);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Trate a exceção adequadamente
        }
    }


    @PostMapping("/adicionar")
    public void adicionar(String linha) {
        String[] dados = linha.split(" - ");
        String data = dados[0];
        String hora = dados[1];

        // Verificar se a linha já existe no banco de dados
        if (!lavagensRepository.existsByDataAndHora(data, hora)) {
            Lavagem lavagem = new Lavagem(data, hora);
            lavagensRepository.save(lavagem);
        } else {
            System.out.println("A linha já existe no banco de dados: " + linha);
            // Ou você pode lançar uma exceção ou fazer outro tratamento aqui
        }
    }


}
