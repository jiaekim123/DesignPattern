package design.pattern.ch21.memento.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextEditorTest {
    @Test
    void givenTextEditor_whenAddTextSaveAddMoreAndUndo_thenSavecStateRestored() {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("메멘토 패턴을 공부한다.\n");
        textEditor.hitSave();
        textEditor.write("오늘은 집중이 안되는 날이다.\n");
        textEditor.hitUndo();
        textEditor.write("언능 끝내고 자야겠다.\n");
        textEditor.hitUndo();
        
        assertThat(textEditor.print()).isEqualTo("메멘토 패턴을 공부한다.\n");
    }
}