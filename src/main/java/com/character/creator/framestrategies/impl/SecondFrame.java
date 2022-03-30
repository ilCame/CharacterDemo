package com.character.creator.framestrategies.impl;

import com.character.creator.framestrategies.FrameStr;
import com.character.creator.framestrategies.SpringUtilities;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class SecondFrame extends FrameStr {
    boolean newOrLoad;
    JFrame frame;
    JButton saveChar;
    List<String> labels = Arrays.asList("STR", "DEX", "COS", "INT", "WIS", "CHA");
    int nOfLables = labels.size();


    public SecondFrame(boolean newOrLoad) {
        frame = super.addFrame(500, 500, new SpringLayout());

        this.newOrLoad = newOrLoad;
        this.saveChar = new JButton("save");

        addButtonInFrame();
        addLabelInFrame();

        SpringUtilities.makeCompactGrid(frame,
                nOfLables, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);
    }

    @Override
    public void addButtonInFrame() {
        frame.add(saveChar);
    }

    @Override
    public void addLabelInFrame(){
        for (String label: labels) {
            JLabel lb = new JLabel(label, JLabel.TRAILING);
            frame.add(lb);
            JTextField textField = new JTextField(10);
            lb.setLabelFor(textField);
            frame.add(textField);
        }
    }

}
