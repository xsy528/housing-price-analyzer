package com.analyzer.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "web_form", schema = "analyzer", catalog = "")
public class WebFormEntity {
    private int wId;
    private String wWeb;
    private String wWebName;
    private String wFirstWeb;
    private int wReliability;
    private int wIsRhp;

    @Id
    @Column(name = "w_id")
    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    @Basic
    @Column(name = "w_web")
    public String getwWeb() {
        return wWeb;
    }

    public void setwWeb(String wWeb) {
        this.wWeb = wWeb;
    }

    @Basic
    @Column(name = "w_web_name")
    public String getwWebName() {
        return wWebName;
    }

    public void setwWebName(String wWebName) {
        this.wWebName = wWebName;
    }

    @Basic
    @Column(name = "w_first_web")
    public String getwFirstWeb() {
        return wFirstWeb;
    }

    public void setwFirstWeb(String wFirstWeb) {
        this.wFirstWeb = wFirstWeb;
    }

    @Basic
    @Column(name = "w_reliability")
    public int getwReliability() {
        return wReliability;
    }

    public void setwReliability(int wReliability) {
        this.wReliability = wReliability;
    }

    @Basic
    @Column(name = "w_is_rhp")
    public int getwIsRhp() {
        return wIsRhp;
    }

    public void setwIsRhp(int wIsRhp) {
        this.wIsRhp = wIsRhp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebFormEntity that = (WebFormEntity) o;
        return wId == that.wId &&
                wReliability == that.wReliability &&
                wIsRhp == that.wIsRhp &&
                Objects.equals(wWeb, that.wWeb) &&
                Objects.equals(wWebName, that.wWebName) &&
                Objects.equals(wFirstWeb, that.wFirstWeb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wId, wWeb, wWebName, wFirstWeb, wReliability, wIsRhp);
    }
}
