package org.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/resposta")
public class RespostaResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response responder(org.example.PerguntaRequest req) {
        String resposta = "Resposta mockada para a pergunta: " + req.getPergunta();
        return Response.ok(new org.example.RespostaResponse(resposta)).build();
    }
}
