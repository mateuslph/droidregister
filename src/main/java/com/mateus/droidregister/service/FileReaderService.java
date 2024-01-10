package com.mateus.droidregister.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

    public List<String> lerArquivo(String caminho) throws IOException {
        List<String> linhas = new ArrayList<>();

        Path path = Paths.get(caminho);

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        }

        return linhas;
    }
}
