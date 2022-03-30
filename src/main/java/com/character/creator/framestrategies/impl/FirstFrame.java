package com.character.creator.framestrategies.impl;

import com.character.creator.framestrategies.FrameStr;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends FrameStr{
    JFrame frame;
    JButton newChar, loadChar;

    public FirstFrame(){
        this.newChar = new JButton("New character");
        this.loadChar = new JButton("Load character");

        frame = super.addFrame(200, 90, new FlowLayout());
        addButtonInFrame();

        listener();
    }

    @Override
    public void addButtonInFrame() {
        frame.add(newChar);
        frame.add(loadChar);
    }

    public void listener(){
        newChar.addActionListener(e ->{
            frame.dispose();
            new SecondFrame( false);}
        );

        loadChar.addActionListener(e ->{
            frame.dispose();
            new SecondFrame( true);
        });
    }

}
