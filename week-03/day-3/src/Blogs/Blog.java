package Blogs;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogs = new ArrayList<>();

    public void add(BlogPost post) {
        this.blogs.add(post);
    }

    public void delete(int i) {
        this.blogs.remove(i);
    }

    public void update(int i, BlogPost post) {
        this.blogs.set(i, post);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < blogs.size(); i++) {
            result += (i + 1) + ". " + "\n" + blogs.get(i) + "\n";
        }
        return result;
    }
}
