package net.smi2.entities.db;

import org.codehaus.jackson.map.annotate.JsonView;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Oleg Konstantinov
 * Date: 02.02.12
 * Time: 13:36
 */
@javax.persistence.Table(name = "smi_images", schema = "", catalog = "smi20")
@Entity
public class SmiImagesEntity  extends Smi2Entity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    @JsonView(ShortView.class)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String type;

    @javax.persistence.Column(name = "type")
    @Basic
    @JsonView(ShortView.class)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name;

    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int width;

    @javax.persistence.Column(name = "width")
    @Basic
    @JsonView(ShortView.class)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int height;

    @javax.persistence.Column(name = "height")
    @Basic
    @JsonView(ShortView.class)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiImagesEntity that = (SmiImagesEntity) o;

        if (height != that.height) return false;
        if (id != that.id) return false;
        if (width != that.width) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }
}
