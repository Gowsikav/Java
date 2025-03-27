class Stanza 
{
    String title;
    String author;
    int lines;
    int words;
    boolean isRhyming;
    String language;
    String theme;
    boolean isPublished;
    int yearWritten;
    String meter;
    boolean hasAlliteration;

    Stanza() {
        System.out.println("No argument Constructor");
    }

    Stanza(String title) {
        this.title = title;
    }

    Stanza(String title, String author) {
        this(title);
        this.author = author;
    }

    Stanza(String title, String author, int lines) {
        this(title, author);
        this.lines = lines;
    }

    Stanza(String title, String author, int lines, int words) {
        this(title, author, lines);
        this.words = words;
    }

    Stanza(String title, String author, int lines, int words, boolean isRhyming) {
        this(title, author, lines, words);
        this.isRhyming = isRhyming;
    }

    Stanza(String title, String author, int lines, int words, boolean isRhyming, String language) 
    {
        this(title, author, lines, words, isRhyming);
        this.language = language;
    }

    Stanza(String title, String author, int lines, int words, boolean isRhyming, String language, 
        String theme) 
    {
        this(title, author, lines, words, isRhyming, language);
        this.theme = theme;
    }

    Stanza(String title, String author, int lines, int words, boolean isRhyming, String language, 
        String theme, boolean isPublished) 
    {
        this(title, author, lines, words, isRhyming, language, theme);
        this.isPublished = isPublished;
    }

    Stanza(String title, String author, int lines, int words, boolean isRhyming, String language, 
        String theme, boolean isPublished, int yearWritten) 
    {
        this(title, author, lines, words, isRhyming, language, theme, isPublished);
        this.yearWritten = yearWritten;
    }

    Stanza(String title, String author, int lines, int words, boolean isRhyming, String language,
     String theme, boolean isPublished, int yearWritten, String meter, boolean hasAlliteration) 
    {
        this(title, author, lines, words, isRhyming, language, theme, isPublished, yearWritten);
        this.meter = meter;
        this.hasAlliteration = hasAlliteration;
    }

    void info() 
    {
        System.out.println("\nStanza Details:");
        
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Lines: " + this.lines);
        System.out.println("Words: " + this.words);
        System.out.println("Is Rhyming: " + this.isRhyming);
        System.out.println("Language: " + this.language);
        System.out.println("Theme: " + this.theme);
        System.out.println("Is Published: " + this.isPublished);
        System.out.println("Year Written: " + this.yearWritten);
        System.out.println("Meter: " + this.meter);
        System.out.println("Has Alliteration: " + this.hasAlliteration);
    }
}
