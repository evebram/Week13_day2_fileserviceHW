package com.codeclan.fileservice.fileservice.projections;

import com.codeclan.fileservice.fileservice.models.File;
import com.codeclan.fileservice.fileservice.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)

public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
