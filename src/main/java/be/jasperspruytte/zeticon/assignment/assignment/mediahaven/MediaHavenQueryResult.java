package be.jasperspruytte.zeticon.assignment.assignment.mediahaven;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaHavenQueryResult {

    private List<MediaData> mediaDataList;

    public List<MediaData> getMediaDataList() {
        return mediaDataList;
    }

    public void setMediaDataList(List<MediaData> mediaDataList) {
        this.mediaDataList = mediaDataList;
    }
}
