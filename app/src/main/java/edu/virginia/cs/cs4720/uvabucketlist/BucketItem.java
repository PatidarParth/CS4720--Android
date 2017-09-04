package edu.virginia.cs.cs4720.uvabucketlist;

/**
 * Created by pjpat on 9/4/2017.
 */

public class BucketItem {
    private String description;
    private String date;

    public BucketItem(String description, String date) {
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

