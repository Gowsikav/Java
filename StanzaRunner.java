public class StanzaRunner 
{
    public static void main(String[] args) 
    {
        String title = "The Road Not Taken";
        String author = "Robert Frost";
        int lines = 20;
        int words = 144;
        boolean isRhyming = true;
        String language = "English";
        String theme = "Choices & Paths";
        boolean isPublished = true;
        int yearWritten = 1915;
        String meter = "Iambic Tetrameter";
        boolean hasAlliteration = true;

        Stanza stanza1 = new Stanza();
        stanza1.info();

        Stanza stanza2 = new Stanza(title);
        stanza2.info();

        Stanza stanza3 = new Stanza(title, author);
        stanza3.info();

        Stanza stanza4 = new Stanza(title, author, lines);
        stanza4.info();

        Stanza stanza5 = new Stanza(title, author, lines, words);
        stanza5.info();

        Stanza stanza6 = new Stanza(title, author, lines, words, isRhyming);
        stanza6.info();

        Stanza stanza7 = new Stanza(title, author, lines, words, isRhyming, language);
        stanza7.info();

        Stanza stanza8 = new Stanza(title, author, lines, words, isRhyming, language, theme);
        stanza8.info();

        Stanza stanza9 = new Stanza(title, author, lines, words, isRhyming, language, theme, isPublished);
        stanza9.info();

        Stanza stanza10 = new Stanza(title, author, lines, words, isRhyming, language, theme, isPublished, yearWritten);
        stanza10.info();

        Stanza stanza11 = new Stanza(title, author, lines, words, isRhyming, language, theme, isPublished, yearWritten, meter, hasAlliteration);
        stanza11.info();
    }
}
