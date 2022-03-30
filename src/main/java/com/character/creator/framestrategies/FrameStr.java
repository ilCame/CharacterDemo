package com.character.creator.framestrategies;

import javax.swing.*;
import java.awt.*;

public abstract class FrameStr {

    public void addButtonInFrame() {}

    public void addTextInFrame() {}

    public void addLabelInFrame() {}

    public JFrame addFrame(int with, int length, LayoutManager layout) {
        JFrame frame = new JFrame();

        frame.setSize(with, length);
        frame.setLayout(layout);
        frame.setVisible(true);

        return frame;
    }

}
