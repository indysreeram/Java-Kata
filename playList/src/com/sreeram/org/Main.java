package com.sreeram.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Strombringer","Deep Purple");
        album.addSong("Strombringer",4.6);
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy man",4.3);
        album.addSong("Hold On",4.6);
        album.addSong("Lady double dealer",4.27);
        album.addSong("You Can't do it right",6.23);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldier of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("I put the finger on you",3.25);
        album.addSong("Let's go",3.45);
        album.addSong("Inject the Venom",3.33);
        album.addSong("Snowballed",4.51);
        album.addSong("Evil Walks",3.45);
        album.addSong("C.O.D",5.25);
        album.addSong("Breaking the rules",5.32);
        album.addSong("Night of the long knives",5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You Can't do it right",playList);
        albums.get(0).addToPlayList("Holy man",playList);
        albums.get(0).addToPlayList("Speed King",playList);
        albums.get(0).addToPlayList(9,playList);

        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);
        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        ListIterator listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in the Play List");
        } else {
            System.out.println("Now Playing "+ listIterator.next().toString());
        }
    }
}
