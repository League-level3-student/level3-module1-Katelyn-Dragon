package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
			Song sOne = new Song("bestSongEver.mp3");
			Song sTwo = new Song("worstSongEver.mp3");
			Song sThree = new Song("lastSong.mp3");
			sOne.play();
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		ArrayList<Song> playlist = new ArrayList<Song>();
		playlist.add(sOne);
		playlist.add(sTwo);
		playlist.add(sThree);
		JOptionPane.showMessageDialog(null, "Click 'OK' for a random song");
		Random rand = new Random();
		int hold = rand.nextInt(playlist.size());
		for (int i = 0; i < playlist.size(); i++) {
			
		}
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}
}