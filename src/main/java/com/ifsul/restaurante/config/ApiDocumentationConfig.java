package com.ifsul.restaurante.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class ApiDocumentationConfig {
    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("IFSul Restaurante API")
                        .description("Descrição da Api sobre restaurantes.")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("Ruann Lopes Cunha")
                                .email("ruanncunha.ssnfq@academico.ifsul.edu.br")))
                .externalDocs(new ExternalDocumentation()
                        .description("Algum link externo")
                        .url("https:/wiki...."));
    }
}
