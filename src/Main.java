public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

<<<<<<< HEAD
        PlaySongs playsong = new PlaySongs();
        
        playsong.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);

=======
        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
>>>>>>> origin/demo_branch
        
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        

    }
}




