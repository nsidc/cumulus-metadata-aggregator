package gov.nasa.cumulus.metadata.aggregator;

public class BoundingBox {
    private Double bbxNorthernLatitude;
    private Double bbxSouthernLatitude;
    private Double bbxEasternLongitude;
    private Double bbxWesternLongitude;

    public BoundingBox(Double northLat, Double southLat, Double eastLon, Double westLon) {
        this.bbxNorthernLatitude = northLat;
        this.bbxSouthernLatitude = southLat;
        this.bbxEasternLongitude = eastLon;
        this.bbxWesternLongitude = westLon;
    }

    public Double getBbxNorthernLatitude() {
        return bbxNorthernLatitude;
    }

    public void setBbxNorthernLatitude(Double bbxNorthernLatitude) {
        this.bbxNorthernLatitude = bbxNorthernLatitude;
    }

    public Double getBbxSouthernLatitude() {
        return bbxSouthernLatitude;
    }

    public void setBbxSouthernLatitude(Double bbxSouthernLatitude) {
        this.bbxSouthernLatitude = bbxSouthernLatitude;
    }

    public Double getBbxEasternLongitude() {
        return bbxEasternLongitude;
    }

    public void setBbxEasternLongitude(Double bbxEasternLongitude) {
        this.bbxEasternLongitude = bbxEasternLongitude;
    }

    public Double getBbxWesternLongitude() {
        return bbxWesternLongitude;
    }

    public void setBbxWesternLongitude(Double bbxWesternLongitude) {
        this.bbxWesternLongitude = bbxWesternLongitude;
    }
}
