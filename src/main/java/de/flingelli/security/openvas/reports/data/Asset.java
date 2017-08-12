package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Asset {
    @XmlAttribute(name = "asset_id")
    private String assetId;

    public String getAssetId() {
        return assetId;
    }

}
