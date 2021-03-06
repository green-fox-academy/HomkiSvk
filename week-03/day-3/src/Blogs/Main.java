package Blogs;

public class Main {

    public static void main(String[] args) {

        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.",
                "Lorem ipsum dolor sit amet.");
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "2010.10.10.",
                "A popular long-form, stick-figure-illustrated blog about almost everything.");
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM " +
                "to Reckon With Trump", "2017.03.28.",
                """
                        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center " +
                        "of attention. When I asked to take his picture outside one of IBM’s New York City " +
                        "offices, he told me that he wasn’t really into the whole organizer profile thing.""");

        Blog blog = new Blog();

        blog.add(post1);
        blog.add(post2);

        System.out.println(blog);

    }
}
