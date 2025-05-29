package org.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Map;

@Path("/pergunta")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class IaResource {

    private final HttpClient client = HttpClient.newHttpClient();

    @POST
    public Response perguntar(Map<String, String> input) {
        String pergunta = input.get("pergunta");
        try {
            String requestBody = String.format("{\"model\": \"qwen:7b\", \"prompt\": \"%s\"}", pergunta.replace("\"", "\\\""));

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:11434/predict"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // A resposta vem como JSON, vamos retornar direto
            return Response.ok(response.body()).build();

        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(Map.of("error", "Erro ao chamar o modelo: " + e.getMessage()))
                    .build();
        }
    }
}
