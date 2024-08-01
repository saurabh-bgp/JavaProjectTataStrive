class Temp1{
    private String imgUrl;
    private String title;
    private String description;

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Image URL: " + this.imgUrl + "\nTitle: " + this.title + "\nDescription: " + this.description;
    }
}
class MultiPrivteValue {
    public static void main(String[] args) {
       Temp1[] obj = new Temp1[2];
        obj[0] = new Temp1();
        obj[0].setImgUrl("Saurabh");
        obj[0].setTitle("Name");
        obj[0].setDescription("This is name description");
        obj[1] = new Temp1();
        obj[1]. setImgUrl("Saurabh kumar");
        obj[1].setTitle("Name hai");
        obj[1].setDescription("This is name description apne bare me");
        System.out.println(obj[0]+"\n"+obj[1]);

}
}
