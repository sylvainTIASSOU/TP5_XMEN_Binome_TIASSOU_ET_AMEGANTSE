package fr.ucaolan.xmen;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;

public class XMen
{
    private String name, alias, description, pouvoir;
    private  @DrawableRes int idImage;

    public XMen(String name, String alias, String description, String pouvoir, @DrawableRes int idImage) {
        this.name = name;
        this.alias = alias;
        this.description = description;
        this.idImage = idImage;
        this.pouvoir = pouvoir;

    }

    public String getPouvoir() {
        return pouvoir;
    }

    public void setPouvoir(String pouvoir) {
        this.pouvoir = pouvoir;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
