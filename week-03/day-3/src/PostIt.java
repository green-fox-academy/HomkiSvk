public class PostIt {

    private String backgroundColor;
    private String text;
    private String textColor;

    PostIt(String bgColor, String text, String textColor){
        this.backgroundColor = bgColor;
        this.text = text;
        this.textColor = textColor;
    }


    public static void main(String[] args) {

        PostIt orange = new PostIt("orange", "Idea 1", "blue");
        PostIt pink = new PostIt("pink", "Awesome", "black");
        PostIt yellow = new PostIt("yellow", "Superb", "green");


    }

}

