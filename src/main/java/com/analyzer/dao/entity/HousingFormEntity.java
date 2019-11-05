package com.analyzer.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "housing_form", schema = "analyzer", catalog = "")
public class HousingFormEntity {

    public HousingFormEntity() {
    }

    public HousingFormEntity(Integer id, String region, String name, double price, Double prices, String format, double area,
                             String desc, String owner, String location, String other, byte isRhp, int webId) {
        this.id = id;
        this.region = region;
        this.name = name;
        this.price = price;
        this.prices = prices;
        this.format = format;
        this.area = area;
        this.desc = desc;
        this.owner = owner;
        this.location = location;
        this.other = other;
        this.isRhp = isRhp;
        this.webId = webId;
    }

    private Integer id;
    private String region;
    private String name;
    private double price;
    private Double prices;
    private String format;
    private double area;
    private String desc;
    private String owner;
    private String location;
    private String other;
    private byte isRhp;
    private int webId;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "prices")
    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    @Basic
    @Column(name = "format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "area")
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "other")
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Basic
    @Column(name = "is_rhp")
    public byte getIsRhp() {
        return isRhp;
    }

    public void setIsRhp(byte isRhp) {
        this.isRhp = isRhp;
    }

    @Basic
    @Column(name = "web_id")
    public int getWebId() {
        return webId;
    }

    public void setWebId(int webId) {
        this.webId = webId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HousingFormEntity that = (HousingFormEntity) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                Double.compare(that.area, area) == 0 &&
                isRhp == that.isRhp &&
                webId == that.webId &&
                Objects.equals(region, that.region) &&
                Objects.equals(name, that.name) &&
                Objects.equals(prices, that.prices) &&
                Objects.equals(format, that.format) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(location, that.location) &&
                Objects.equals(other, that.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, region, name, price, prices, format, area, desc, owner, location, other, isRhp, webId);
    }

    @Override
    public String toString() {
        return "HousingFormEntity{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", prices=" + prices +
                ", format='" + format + '\'' +
                ", area=" + area +
                ", desc='" + desc + '\'' +
                ", owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", other='" + other + '\'' +
                ", isRhp=" + isRhp +
                ", webId=" + webId +
                '}';
    }
}
