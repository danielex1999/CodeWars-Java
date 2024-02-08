package kyu8.kyu8InterpretersHQ9;

public class HQ {
    public static String HQ9(char code) {
        StringBuilder case9 = new StringBuilder();
        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return "Q";
            case '9':
                for (int i = 99; i >= 0; i--) {

                    if (i == 2) {
                        case9.append(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                        case9.append("\n");
                        case9.append("Take one down and pass it around, " + (i - 1) + " bottle of beer on the wall.");
                        case9.append("\n");
                    } else if (i == 1) {
                        case9.append("1 bottle of beer on the wall, 1 bottle of beer.");
                        case9.append("\n");
                        case9.append("Take one down and pass it around, no more bottles of beer on the wall.");
                        case9.append("\n");
                    } else if (i == 0) {
                        case9.append("No more bottles of beer on the wall, no more bottles of beer.");
                        case9.append("\n");
                        case9.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
                    } else {
                        case9.append(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                        case9.append("\n");
                        case9.append("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
                        case9.append("\n");
                    }
                }
                return case9.toString();
            default:
                return null;
        }
    }
}