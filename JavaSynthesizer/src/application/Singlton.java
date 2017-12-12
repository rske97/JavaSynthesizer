package application;

import javax.naming.InitialContext;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;

public class Singlton {

	private static Singlton instance = null;
	
	public static Singlton getInstance() throws MidiUnavailableException {
		return instance == null ? instance = new Singlton() : instance;
	}
	
	private Synthesizer sint;
	final MidiChannel[] m = sint.getChannels();
	private Instrument[] inst = sint.getDefaultSoundbank().getInstruments();
	
	
	public Singlton() throws MidiUnavailableException {
		init();
	}
	public Instrument[] getInst() {
		return inst;
	}
	public void setInst(Instrument[] inst) {
		this.inst = inst;
	}
	public Synthesizer getSint() {
		return sint;
	}
	public void setSint(Synthesizer sint) {
		this.sint = sint;
	}
	public void init() throws MidiUnavailableException {
	 sint = MidiSystem.getSynthesizer();
	 sint.open();
	
	
	}
	
}
