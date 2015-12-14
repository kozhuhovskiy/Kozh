import javax.swing.*;
import java.util.ArrayList;

public class QuizCardPlayer {

    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCardPlayer> cardList;
    private JFrame frame;
    private QuizCardPlayer currentCard;
  private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuizCardPlayer that = (QuizCardPlayer) o;

        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;
        if (cardList != null ? !cardList.equals(that.cardList) : that.cardList != null) return false;
        if (!currentCard.equals(that.currentCard)) return false;
        if (display != null ? !display.equals(that.display) : that.display != null) return false;
        if (frame != null ? !frame.equals(that.frame) : that.frame != null) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = display != null ? display.hashCode() : 0;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (cardList != null ? cardList.hashCode() : 0);
        result = 31 * result + (frame != null ? frame.hashCode() : 0);
        result = 31 * result + currentCard.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
