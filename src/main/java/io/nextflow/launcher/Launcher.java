package io.nextflow.launcher;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author : jorge <jorge.aguilera@seqera.io>
 */
public class Launcher {

    public void run(String version) throws IOException {
        String template = new String(this.getClass().getResourceAsStream("/build.gradle").readAllBytes())
                .replace("_NXF_VER_", version);

        Path temp = Files.createTempDirectory("nf-build");
        Files.writeString(temp.resolve("build.gradle"), template);
        Files.writeString(temp.resolve("settings.gradle"), "");

        GradleConnector connector = new GradleConnector(temp.toAbsolutePath().toString());
        connector.dependencies().stream().forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        String nfver = args.length == 1 ? args[0] : "22.10.1";
        new Launcher()
                .run(nfver);
    }
}
