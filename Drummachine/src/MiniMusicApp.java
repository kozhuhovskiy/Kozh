import javax.sound.midi.*;

public class MiniMusicApp {

    public static void main(String[] args) {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1 , 14, 100);
            MidiEvent noteOn = new MidiEvent(a, 2);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(192, 1, 34, 100);
            MidiEvent noteOff = new MidiEvent(b, 6);
            track.add(noteOff);

            ShortMessage c = new ShortMessage();
            c.setMessage(128, 1, 24, 100);
            MidiEvent midiEvent = new MidiEvent(c, 3);
            track.add(midiEvent);

            ShortMessage ab = new ShortMessage();
            a.setMessage(134, 1, 102, 100);
            MidiEvent noteOb = new MidiEvent(ab, 2);
            track.add(noteOb);

            player.setSequence(seq);
            player.start();
        }
        catch ( Exception ex) {
            ex.printStackTrace();
        }

    }
}
