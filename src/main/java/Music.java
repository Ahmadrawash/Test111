public class Music {
    String title;
    String Num;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }

    public Music(String title, String num) {
        this.title = title;
        Num = num;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", Num='" + Num + '\'' +
                '}';
    }
}
