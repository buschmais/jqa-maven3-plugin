package com.buschmais.jqassistant.plugin.maven3.api.model;

import java.util.List;

import com.buschmais.jqassistant.core.store.api.model.FileContainerDescriptor;
import com.buschmais.jqassistant.plugin.common.api.model.ArtifactDescriptor;
import com.buschmais.xo.neo4j.api.annotation.Relation;

public interface MavenProjectDirectoryDescriptor extends MavenProjectDescriptor, FileContainerDescriptor {

    @Relation("CREATES")
    List<ArtifactDescriptor> getCreatesArtifacts();

    @Relation("HAS_PARENT")
    MavenProjectDescriptor getParent();

    void setParent(MavenProjectDescriptor parentDescriptor);

    @Relation("HAS_MODULE")
    List<MavenProjectDescriptor> getModules();
}
