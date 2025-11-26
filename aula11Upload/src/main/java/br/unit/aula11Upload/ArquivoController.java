package br.unit.aula11Upload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class ArquivoController {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void recebeArquivo(@RequestPart("nome") String nome,
            @RequestPart("email") String email,
            @RequestPart("telefone") String telefone,
            @RequestPart("document") MultipartFile arquivoRecebido) {
        PessoaDTO pessoa = new PessoaDTO(nome, email, telefone);

        System.out.println("MIME: " + arquivoRecebido.getContentType());
        System.out.println("Tamanho: " + arquivoRecebido.getSize());

        File arquivoDisco = new File(arquivoRecebido.getOriginalFilename());
        try (
            InputStream fileContent = arquivoRecebido.getInputStream();
            OutputStream outputStream = Files.newOutputStream(arquivoDisco.toPath())
                            ) {
            byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fileContent.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("Arquivo salvo em: " + arquivoDisco.getAbsolutePath());
            }catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + arquivoDisco.getAbsolutePath());
        }

        }

    }
