public class Exc6AuthorTest {

    public static void main(String[] args) {
        Exc6Author author = new Exc6Author("Jordan", 'M', "generic_email@whatever.com");

        System.out.println(author);

        author.setEmail("new_Email@gmail.com");
        author.setGender('F');
        author.setName("Jessica");

        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());


    }


}
