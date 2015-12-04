import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Получаем синтезатор");
        } catch (MidiUnavailableException e) {
            System.out.println("Ошибка");
        }


    }

    public static void main(String[] args) throws MidiUnavailableException {
        MusicTest mt = new MusicTest();
        mt.play();
    }
}
