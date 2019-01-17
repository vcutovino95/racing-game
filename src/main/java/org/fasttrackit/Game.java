package org.fasttrackit;

public class Game {


    private Track[] tracks = new Track[10];

    Vehicle firstCompetitor;
    Vehicle secondCompetitor;


    public void start() {


        addTracks();
        displayAvailableTrack();
    }


    private void addTracks() {


        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);


        tracks[0] = track1;
        tracks[1] = track2;


    }


    private void displayAvailableTrack() {


        System.out.println("Available tracks");
        System.out.println(tracks[0].getName());
        System.out.println(tracks[1].getName());


        // classic for loop
//        for (int i = 0; i < tracks.length; i++) {
//
//
//            if (tracks[i] != null) {
//                System.out.println(tracks[i].getName());
//
//
//            }
//
//
//        }


        // enhanced for / "for-each"
        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());



            }
        }

    }

}
