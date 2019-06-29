package dv.android.com.customrecyclerview;

public class CharacterDTO {

    private String name;
    private String description;
    private int photo;

    public CharacterDTO(String name, String description, int photo) {
        this.name = name;
        this.description = description;
        this.photo = photo;
    }

    //Getter and Setter Methods.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
