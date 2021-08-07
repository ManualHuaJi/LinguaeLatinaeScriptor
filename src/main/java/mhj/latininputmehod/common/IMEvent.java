package mhj.latininputmehod.common;

import java.awt.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;

public class IMEvent implements InputMethodListener, InputMethodRequests {
    @Override
    public void inputMethodTextChanged(InputMethodEvent event) {

    }

    @Override
    public void caretPositionChanged(InputMethodEvent event) {

    }

    @Override
    public Rectangle getTextLocation(TextHitInfo offset) {
        return null;
    }

    @Override
    public TextHitInfo getLocationOffset(int x, int y) {
        return null;
    }

    @Override
    public int getInsertPositionOffset() {
        return 0;
    }

    @Override
    public AttributedCharacterIterator getCommittedText(int beginIndex, int endIndex, AttributedCharacterIterator.Attribute[] attributes) {
        return null;
    }

    @Override
    public int getCommittedTextLength() {
        return 0;
    }

    @Override
    public AttributedCharacterIterator cancelLatestCommittedText(AttributedCharacterIterator.Attribute[] attributes) {
        return null;
    }

    @Override
    public AttributedCharacterIterator getSelectedText(AttributedCharacterIterator.Attribute[] attributes) {
        return null;
    }
}
