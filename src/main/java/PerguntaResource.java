package org.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/pergunta")
public class PerguntaResource {

    @Inject
    org.example.OllamaService ollamaService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String perguntar(DadosPergunta dados) {
        return ollamaService.perguntarParaIA(dados.pergunta());
    }

    public record DadosPergunta(String pergunta) {}
}
