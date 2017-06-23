package com.lianjisoft;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "photos")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
class Photo implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @Size(min = 5)
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "datetimeoriginal")
    private LocalDate datetimeoriginal;
    @Column(name = "width")
    private Integer width;
    @Column(name = "height")
    private Integer height;
    @Column(name = "exposuretime")
    private String exposuretime;
    @Column(name = "fnumber")
    private String fnumber;
    @Column(name = "model")
    private String model;
    @Column(name = "make")
    private String make;
    @Column(name = "copyright")
    private String copyright;
    @Column(name = "isospeedratings")
    private Integer isospeedratings;
    @Column(name = "aperturevalue")
    private String aperturevalue;
    @Column(name = "maxaperturevalue")
    private String maxaperturevalue;
    @Column(name = "focallength")
    private String focallength;
    @Column(name = "url")
    private String url;

    public Photo(String name, String description, LocalDate datetimeoriginal, Integer width, Integer height, String exposuretime, String fnumber, String model, String make, String copyright, Integer isospeedratings, String aperturevalue, String maxaperturevalue, String focallength, String url) {
        this.name = name;
        this.description = description;
        this.datetimeoriginal = datetimeoriginal;
        this.width = width;
        this.height = height;
        this.exposuretime = exposuretime;
        this.fnumber = fnumber;
        this.model = model;
        this.make = make;
        this.copyright = copyright;
        this.isospeedratings = isospeedratings;
        this.aperturevalue = aperturevalue;
        this.maxaperturevalue = maxaperturevalue;
        this.focallength = focallength;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public Photo name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Photo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDatetimeoriginal() {
        return datetimeoriginal;
    }

    public Photo datetimeoriginal(LocalDate datetimeoriginal) {
        this.datetimeoriginal = datetimeoriginal;
        return this;
    }

    public void setDatetimeoriginal(LocalDate datetimeoriginal) {
        this.datetimeoriginal = datetimeoriginal;
    }

    public Integer getWidth() {
        return width;
    }

    public Photo width(Integer width) {
        this.width = width;
        return this;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public Photo height(Integer height) {
        this.height = height;
        return this;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getExposuretime() {
        return exposuretime;
    }

    public Photo exposuretime(String exposuretime) {
        this.exposuretime = exposuretime;
        return this;
    }

    public void setExposuretime(String exposuretime) {
        this.exposuretime = exposuretime;
    }

    public String getFnumber() {
        return fnumber;
    }

    public Photo fnumber(String fnumber) {
        this.fnumber = fnumber;
        return this;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }

    public String getModel() {
        return model;
    }

    public Photo model(String model) {
        this.model = model;
        return this;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public Photo make(String make) {
        this.make = make;
        return this;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCopyright() {
        return copyright;
    }

    public Photo copyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getIsospeedratings() {
        return isospeedratings;
    }

    public Photo isospeedratings(Integer isospeedratings) {
        this.isospeedratings = isospeedratings;
        return this;
    }

    public void setIsospeedratings(Integer isospeedratings) {
        this.isospeedratings = isospeedratings;
    }

    public String getAperturevalue() {
        return aperturevalue;
    }

    public Photo aperturevalue(String aperturevalue) {
        this.aperturevalue = aperturevalue;
        return this;
    }

    public void setAperturevalue(String aperturevalue) {
        this.aperturevalue = aperturevalue;
    }

    public String getMaxaperturevalue() {
        return maxaperturevalue;
    }

    public Photo maxaperturevalue(String maxaperturevalue) {
        this.maxaperturevalue = maxaperturevalue;
        return this;
    }


    public String getUrl() {
        return url;
    }

    public Photo url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                ", datetimeoriginal='" + getDatetimeoriginal() + "'" +
                ", width='" + getWidth() + "'" +
                ", height='" + getHeight() + "'" +
                ", exposuretime='" + getExposuretime() + "'" +
                ", fnumber='" + getFnumber() + "'" +
                ", model='" + getModel() + "'" +
                ", make='" + getMake() + "'" +
                ", copyright='" + getCopyright() + "'" +
                ", isospeedratings='" + getIsospeedratings() + "'" +
                ", aperturevalue='" + getAperturevalue() + "'" +
                ", maxaperturevalue='" + getMaxaperturevalue() + "'" +
                ", focallength='" + focallength + "'" +
                ", url='" + getUrl() + "'" +
                "}";
    }
}

@SpringBootApplication
public class SpringBootWebApplication {

    public static void extract(String imagePath) throws ImageProcessingException, IOException, MetadataException {
        Metadata metadata = ImageMetadataReader.readMetadata(new File(imagePath));
        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
                System.out.println(directory.getClass().getCanonicalName() + "\t=>\t" + tag);
            }
        }


        // obtain the Exif directory
        ExifSubIFDDirectory exifDir
                = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
        // create a descriptor
        ExifSubIFDDescriptor exifDesc
                = new ExifSubIFDDescriptor(exifDir);

        ExifIFD0Directory exifD0Dir = metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
        ExifIFD0Descriptor exifIFD0Desc = new ExifIFD0Descriptor(exifD0Dir);

        System.out.println(exifD0Dir.getInt(ExifDirectoryBase.TAG_IMAGE_WIDTH));
        System.out.println(exifD0Dir.getInt(ExifDirectoryBase.TAG_IMAGE_HEIGHT));
        System.out.println(exifD0Dir.getString(ExifDirectoryBase.TAG_MAKE));
        System.out.println(exifD0Dir.getString(ExifDirectoryBase.TAG_MODEL));
        System.out.println(exifD0Dir.getString(ExifDirectoryBase.TAG_COPYRIGHT));

        System.out.println(exifDir.getDate(ExifDirectoryBase.TAG_DATETIME_ORIGINAL));
        System.out.println(exifDesc.getExposureTimeDescription());
        System.out.println(exifDesc.getExposureModeDescription());
        System.out.println(exifDesc.getIsoEquivalentDescription());
        System.out.println(exifDesc.getApertureValueDescription());
        System.out.println(exifDesc.getMaxApertureValueDescription());
        System.out.println(exifDesc.getFocalLengthDescription());
    }

    public static void main(String[] args) throws ImageProcessingException, IOException, MetadataException {
        extract("./test.jpg");
        System.exit(0);
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

}
