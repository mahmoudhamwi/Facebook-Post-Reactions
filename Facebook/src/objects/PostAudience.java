package objects;

/**
 * Created by Mahmoud Hamwi on 17-Feb-21.
 */
public enum PostAudience {
    PUBLIC(0,"Public","/img/ic_public.png"),
    FRIENDS(1,"Friends","/img/ic_friend.png");

    private int id;
    private String name;
    private String imgSrc;

    PostAudience(int id, String name, String imgSrc) {
        this.id = id;
        this.name = name;
        this.imgSrc = imgSrc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgSrc() {
        return imgSrc;
    }
}
