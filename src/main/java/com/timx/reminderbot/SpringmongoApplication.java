package com.timx.reminderbot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmongoApplication {
    public static Path downloadedContentDir;

    public static void main(String[] args) throws IOException {
        downloadedContentDir = Files.createTempDirectory("line-bot");
        SpringApplication.run(SpringmongoApplication.class, args);
    }
}
