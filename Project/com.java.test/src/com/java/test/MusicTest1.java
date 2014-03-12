package com.java.test;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MusicTest1 {
	public void play() throws MidiUnavailableException {
		try{
		Sequencer player = MidiSystem.getSequencer();
		player.open();
		System.out.println("We got a sequencer");
		Sequence seq = new Sequence(Sequence.PPQ, 4);
		Track t = seq.createTrack();

		ShortMessage a = new ShortMessage();
		a.setMessage(144, 1, 44, 100);
		MidiEvent noteOn = new MidiEvent(a, 1);
		t.add(noteOn);

		ShortMessage b = new ShortMessage();
		b.setMessage(128, 1, 44, 100);
		MidiEvent noteOff = new MidiEvent(b, 16);
		t.add(noteOff);		
		
		player.setSequence(seq);
		player.start();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		try {
			mt.play();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("That's OK.");
		}
	}

}
