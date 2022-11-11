package io.nextflow.launcher;

import org.gradle.tooling.BuildLauncher;
import org.gradle.tooling.ModelBuilder;
import org.gradle.tooling.ProjectConnection;
import org.gradle.tooling.model.Dependency;
import org.gradle.tooling.model.GradleProject;
import org.gradle.tooling.model.GradleTask;
import org.gradle.tooling.model.idea.IdeaDependency;
import org.gradle.tooling.model.idea.IdeaModule;
import org.gradle.tooling.model.idea.IdeaProject;
import org.gradle.tooling.model.idea.IdeaSingleEntryLibraryDependency;
import org.gradle.util.GradleVersion;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : jorge <jorge.aguilera@seqera.io>
 */
public class GradleConnector {
    private org.gradle.tooling.GradleConnector connector;

    public GradleConnector(String projectDir) {
        connector = org.gradle.tooling.GradleConnector.newConnector();
        connector.useGradleVersion("7.4.2");
        connector.forProjectDirectory(new File(projectDir));
    }

    public List<String> dependencies(){
        ProjectConnection connection = connector.connect();

        ModelBuilder<IdeaProject> modelBuilder = connection.model(IdeaProject.class);
        IdeaProject project = modelBuilder.get();
        List<String> ret = new ArrayList<>();
        for (IdeaModule module : project.getModules()) {
            for (IdeaDependency dependency : module.getDependencies()) {
                IdeaSingleEntryLibraryDependency tmp= (IdeaSingleEntryLibraryDependency)dependency;
                ret.add(tmp.getFile().getAbsolutePath());
            }
        }

        connection.close();
        return ret;
    }
}
