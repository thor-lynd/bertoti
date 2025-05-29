package org.example;

import jakarta.enterprise.context.ApplicationScoped;
import java.net.URI;
import java.net.http.*;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@ApplicationScoped
public class OllamaService {

    private static final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public String perguntarParaIA(String pergunta) {
        try {
            String requestBody = """
                {
                    "model": "qwen:7b",
                    "prompt": "%s",
                    "stream": false
                }
                """.formatted(pergunta);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:11434/api/generate"))
                    .timeout(Duration.ofSeconds(30))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String body = response.body();
            System.out.println("Resposta bruta da IA: " + body);

            JsonNode root = mapper.readTree(body);
            JsonNode respostaNode = root.get("response");

            if (respostaNode != null) {
                // Substitui corretamente as quebras de linha JSON por quebras de linha Java
                return respostaNode.asText().replace("\\n", "\n");
            } else {
                return "Erro ao interpretar resposta da IA.";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao se comunicar com o Ollama: " + e.getMessage();
        }
    }
}
