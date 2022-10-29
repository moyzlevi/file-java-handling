package org.example;

import com.diogonunes.jcolor.AnsiFormat;

import static com.diogonunes.jcolor.Attribute.*;

public class Color {
    public static AnsiFormat fWarning = new AnsiFormat(RED_TEXT(), BOLD());
    public static AnsiFormat fOk = new AnsiFormat(CYAN_TEXT(), BOLD());
}
