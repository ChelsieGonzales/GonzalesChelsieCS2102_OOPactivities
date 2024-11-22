public class ArtistDemo {
    public static void main(String[] args) {
        
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();
        
        System.out.println();
        
        Singer singer = new Singer("Nayeon Im", "South Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Hoshi", "South Korean", 28, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Juan Luna", "Filipino", 42, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Lang Leav", "Filipino-Australian", 44, "Writing", WritingStyle.POETRY);
        writer.displayInfo();
    }
}
