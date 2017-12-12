package controller;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiUnavailableException;

import application.Singlton;

public class Akcija {


	public Instrument[] getN() {
		return n;
	}

	public void setN(Instrument[] n) {
		this.n = n;
	}

	private Instrument[] n = Singlton.getInstance().getInst();
	
	public Akcija(int i) throws MidiUnavailableException {
		Singlton.getInstance().getSint().loadInstrument(n[i]);
	}
}
