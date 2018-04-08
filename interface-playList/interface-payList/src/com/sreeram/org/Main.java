package com.sreeram.org;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();
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
        printMenu();
        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        boolean forward =false;
        boolean quit=false;
        Scanner scanner = new Scanner(System.in);
        ListIterator listIterator = playList.listIterator();

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 :
                    System.out.println("Quitting the playlist");
                    quit=true;
                    break;
                case 1 :
                     if (!forward){
                         if(listIterator.hasNext()){
                             listIterator.next();
                         }
                         forward=true;
                     }
                     if(listIterator.hasNext()) {
                         System.out.println("Now Playing "+ listIterator.next().toString());
                     } else {
                         System.out.println("We have reached the end of the play list");
                         forward=false;
                     }
                     break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the play list");
                        forward=true;
                    }
                    break;

                case 3:
                    if (forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward=false;
                        } else {
                            System.out.println("We have reached the start of the play list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying"+ listIterator.next().toString());
                            forward=true;
                        } else {
                            System.out.println("we have reached the end ot the play list");
                        }

                    }
                    break;
                case 4:
                     printPlayList(playList);
                     break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous());
                        }
                    }
                    break;


            }


        }

    }

    private static void printMenu(){
        System.out.println("Available actions\nPress");
        System.out.println("0 -> To Quit play list \n"+
                    "1 -> To play the next song\n" +
                    "2 -> To play the previous song\n"+
                    "3 -> To play the current song\n"+
                    "4 -> To print the play list\n"+
                    "5 -> To print the actions\n"+
                    "6 -> To remove the song");
    }

    private static void printPlayList(List<Song> playList){
        Iterator iterator = playList.iterator();
        System.out.println("========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========================");
    }
}
