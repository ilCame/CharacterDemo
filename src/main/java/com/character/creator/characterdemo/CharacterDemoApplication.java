package com.character.creator.characterdemo;

import com.character.creator.framestrategies.impl.FirstFrame;

import javax.swing.*;

public class CharacterDemoApplication extends JFrame{

    CharacterDemoApplication() {
        new FirstFrame();
    }

    public static void main(String[] args) {

        new CharacterDemoApplication();

    }
}
