package org.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

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

    @Path("/pergunta")
    public static class PerguntaResource {

        public static class PerguntaRequest {
            private String pergunta;

            public String getPergunta() {
                return pergunta;
            }

            public void setPergunta(String pergunta) {
                this.pergunta = pergunta;
            }
        }

        public static class RespostaResponse {
            private String resposta;

            public RespostaResponse() {}

            public RespostaResponse(String resposta) {
                this.resposta = resposta;
            }

            public String getResposta() {
                return resposta;
            }

            public void setResposta(String resposta) {
                this.resposta = resposta;
            }
        }

        @POST
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.APPLICATION_JSON)
        public Response responder(PerguntaRequest req) {
            String resposta = "Resposta mockada para a pergunta: " + req.getPergunta();
            return Response.ok(new RespostaResponse(resposta)).build();
        }
    }
}
