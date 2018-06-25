package be.jasperspruytte.zeticon.assignment.assignment.mediahaven;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaData {

    private String title;
    private String previewImagePath;
    private String thumbnailImagePath;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreviewImagePath() {
        return previewImagePath;
    }

    public void setPreviewImagePath(String previewImagePath) {
        this.previewImagePath = previewImagePath;
    }

    public String getThumbnailImagePath() {
        return thumbnailImagePath;
    }

    public void setThumbnailImagePath(String thumbnailImagePath) {
        this.thumbnailImagePath = thumbnailImagePath;
    }
}
