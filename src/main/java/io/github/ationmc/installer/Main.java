package io.github.ationmc.installer;


import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

/**
 * @author Enaium
 */
public class Main {
    public static void main(String[] args) {
        FlatArcDarkOrangeIJTheme.setup();
        new MainGUI().setVisible(true);
    }
}
