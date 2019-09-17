package com.codeclan.fileservice.fileservice.projections;
import com.codeclan.fileservice.fileservice.models.Folder;
import com.codeclan.fileservice.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
}
